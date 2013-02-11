package org.eclipse.xtend.ide.tests.refactoring;

import com.google.inject.Inject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.participants.RenameRefactoring;
import org.eclipse.ltk.internal.core.refactoring.resource.RenameResourceProcessor;
import org.eclipse.xtend.ide.tests.AbstractXtendUITestCase;
import org.eclipse.xtend.ide.tests.WorkbenchTestHelper;
import org.eclipse.xtend.ide.tests.refactoring.FileAsserts;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class RenameResourceTest extends AbstractXtendUITestCase {
  @Inject
  private WorkbenchTestHelper _workbenchTestHelper;
  
  @Inject
  private IWorkspace workspace;
  
  @Inject
  private FileAsserts _fileAsserts;
  
  @Test
  public void testRenameClassWithSameName() {
    try {
      try {
        IFile _createFile = this._workbenchTestHelper.createFile("Foo", "class Foo {}");
        IFile _renameTo = this.renameTo(_createFile, "Bar.xtend");
        this._fileAsserts.assertFileContains(_renameTo, "class Bar {}");
      } finally {
        IFile _file = this._workbenchTestHelper.getFile("Bar.xtend");
        _file.delete(true, null);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDontRenameClassWithDifferenName() {
    try {
      try {
        IFile _createFile = this._workbenchTestHelper.createFile("Foo", "class FooBar {}");
        IFile _renameTo = this.renameTo(_createFile, "Bar.xtend");
        this._fileAsserts.assertFileContains(_renameTo, "class FooBar {}");
      } finally {
        IFile _file = this._workbenchTestHelper.getFile("Bar.xtend");
        _file.delete(true, null);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGuardMissingFileExtension() {
    try {
      try {
        IFile _createFile = this._workbenchTestHelper.createFile("Foo", "class Foo {}");
        IFile _renameTo = this.renameTo(_createFile, "Bar");
        this._fileAsserts.assertFileContains(_renameTo, "class Foo {}");
      } finally {
        IFile _file = this._workbenchTestHelper.getFile("Bar");
        _file.delete(true, null);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected IFile renameTo(final IFile file, final String newFileName) {
    try {
      IFile _xblockexpression = null;
      {
        RenameResourceProcessor _renameResourceProcessor = new RenameResourceProcessor(file);
        final RenameResourceProcessor renameResourceProcessor = _renameResourceProcessor;
        renameResourceProcessor.setNewResourceName(newFileName);
        RenameRefactoring _renameRefactoring = new RenameRefactoring(renameResourceProcessor);
        final RenameRefactoring renameRefactoring = _renameRefactoring;
        NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
        renameRefactoring.checkAllConditions(_nullProgressMonitor);
        NullProgressMonitor _nullProgressMonitor_1 = new NullProgressMonitor();
        final Change change = renameRefactoring.createChange(_nullProgressMonitor_1);
        final IWorkspaceRunnable _function = new IWorkspaceRunnable() {
            public void run(final IProgressMonitor it) throws CoreException {
              change.perform(it);
            }
          };
        NullProgressMonitor _nullProgressMonitor_2 = new NullProgressMonitor();
        this.workspace.run(_function, _nullProgressMonitor_2);
        IProject _project = this._workbenchTestHelper.getProject();
        String _plus = ("src/" + newFileName);
        Path _path = new Path(_plus);
        final IResource newFile = _project.findMember(_path);
        boolean _exists = newFile.exists();
        Assert.assertTrue(_exists);
        Assert.assertTrue((newFile instanceof IFile));
        _xblockexpression = (((IFile) newFile));
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

package example6;

import com.google.common.io.CharStreams;
import example6.Movie;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class Movies {
  /**
   * @return the total number of action movies
   */
  @Test
  public void numberOfActionMovies() {
    final Function1<Movie,Boolean> _function = new Function1<Movie,Boolean>() {
        public Boolean apply(final Movie it) {
          Set<String> _categories = it.getCategories();
          boolean _contains = _categories.contains("Action");
          return Boolean.valueOf(_contains);
        }
      };
    Iterable<Movie> _filter = IterableExtensions.<Movie>filter(this.movies, _function);
    int _size = IterableExtensions.size(_filter);
    Assert.assertEquals(828, _size);
  }
  
  /**
   * @return the year the best rated movie of 80ies (1980-1989) was released.
   */
  @Test
  public void yearOfBestMovieFrom80ies() {
    final Function1<Movie,Boolean> _function = new Function1<Movie,Boolean>() {
        public Boolean apply(final Movie it) {
          IntegerRange _upTo = new IntegerRange(1980, 1989);
          int _year = it.getYear();
          boolean _contains = _upTo.contains(_year);
          return Boolean.valueOf(_contains);
        }
      };
    Iterable<Movie> _filter = IterableExtensions.<Movie>filter(this.movies, _function);
    final Function1<Movie,Double> _function_1 = new Function1<Movie,Double>() {
        public Double apply(final Movie it) {
          double _rating = it.getRating();
          return Double.valueOf(_rating);
        }
      };
    List<Movie> _sortBy = IterableExtensions.<Movie, Double>sortBy(_filter, _function_1);
    Movie _last = IterableExtensions.<Movie>last(_sortBy);
    int _year = _last.getYear();
    Assert.assertEquals(1989, _year);
  }
  
  /**
   * @return the sum of the number of votes of the two top rated movies.
   */
  @Test
  public void sumOfVotesOfTop2() {
    final Function1<Movie,Double> _function = new Function1<Movie,Double>() {
        public Double apply(final Movie it) {
          double _rating = it.getRating();
          double _minus = (-_rating);
          return Double.valueOf(_minus);
        }
      };
    List<Movie> _sortBy = IterableExtensions.<Movie, Double>sortBy(this.movies, _function);
    Iterable<Movie> _take = IterableExtensions.<Movie>take(_sortBy, 2);
    final Function1<Movie,Long> _function_1 = new Function1<Movie,Long>() {
        public Long apply(final Movie it) {
          long _numberOfVotes = it.getNumberOfVotes();
          return Long.valueOf(_numberOfVotes);
        }
      };
    Iterable<Long> _map = IterableExtensions.<Movie, Long>map(_take, _function_1);
    final Function2<Long,Long,Long> _function_2 = new Function2<Long,Long,Long>() {
        public Long apply(final Long a, final Long b) {
          long _plus = ((a).longValue() + (b).longValue());
          return Long.valueOf(_plus);
        }
      };
    final long movies = (IterableExtensions.<Long>reduce(_map, _function_2)).longValue();
    Assert.assertEquals(47229, movies);
  }
  
  private final List<Movie> movies = new Function0<List<Movie>>() {
    public List<Movie> apply() {
      try {
        FileReader _fileReader = new FileReader("data.csv");
        List<String> _readLines = CharStreams.readLines(_fileReader);
        final Function1<String,Movie> _function = new Function1<String,Movie>() {
            public Movie apply(final String line) {
              String[] _split = line.split("  ");
              final Iterator<String> segments = ((List<String>)Conversions.doWrapArray(_split)).iterator();
              String _next = segments.next();
              String _next_1 = segments.next();
              int _parseInt = Integer.parseInt(_next_1);
              String _next_2 = segments.next();
              double _parseDouble = Double.parseDouble(_next_2);
              String _next_3 = segments.next();
              long _parseLong = Long.parseLong(_next_3);
              Set<String> _set = IteratorExtensions.<String>toSet(segments);
              Movie _movie = new Movie(_next, _parseInt, _parseDouble, _parseLong, _set);
              return _movie;
            }
          };
        List<Movie> _map = ListExtensions.<String, Movie>map(_readLines, _function);
        return _map;
      } catch (Exception _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
}

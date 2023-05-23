class VideoTape {
    public String title;
    public double duration;
    
    public VideoTape(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    
    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class Movie extends VideoTape {
    Double director_rating;
    
    public Movie(String title, double duration, Double director_rating) {
        super(title, duration);
        this.director_rating = director_rating;
    }
    
    public void show() {
        super.show();
        System.out.println("Director Rating: " + director_rating);
    }
}

class MusicVideo extends VideoTape {
    private String artist_category;
    
    public MusicVideo(String title, double duration, String artist_category) {
        super(title, duration);
        this.artist_category = artist_category;
    }
    
    public void show() {
        super.show();
        System.out.println("Artist: " + artist_category);
    }
}

public class _20_herarchicalInheritanceMovie {
    public static void main(String[] args) {
        Movie movie = new Movie("The Shawshank Redemption", 142.5, 3.0);
        movie.show();
        
        System.out.println();
        
        MusicVideo musicVideo = new MusicVideo("Shape of You", 4.2, "Ed Sheeran -> Silent");
        musicVideo.show();
    }
}

public class Dubstep {
    public static String SongDecoder (String song) {
        String decodedSong = song.replaceAll("(WUB)+", " ").trim();
        return decodedSong;
    }
}

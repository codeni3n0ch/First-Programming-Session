
/* Ferreria, Enoch Cuthbert A.
 * Final Challenge 1
 * December 4,2024
*/
import java.util.Scanner;

// This class represents a single song in the playlist
class SongNode {
    String songName; // The name of the song
    SongNode next;   // Pointer to the next song in the list
    SongNode prev;   // Pointer to the previous song in the list

    // This constructor creates a new song node with a given name
    public SongNode(String songName) {
        this.songName = songName; // Set the song name
        this.next = null;         // Initially, there is no next song
        this.prev = null;         // Initially, there is no previous song
    }
}

// This class manages the playlist and allows us to perform actions on it
public class PlaylistManager {
    private SongNode currentSong; // This is the song that is currently playing
    private int size;             // This keeps track of how many songs are in the playlist

    // This constructor sets up the playlist manager
    public PlaylistManager() {
        this.currentSong = null; // Start with no current song
        this.size = 0;           // Start with zero songs in the playlist
    }

    // This method adds a new song to the playlist
    public void addSong(String songName) {
        SongNode newSong = new SongNode(songName); // Create a new song node

        if (size == 0) {
            // If there are no songs, set the new song as the current song
            currentSong = newSong;
            currentSong.next = currentSong; // Point to itself as next
            currentSong.prev = currentSong; // Point to itself as previous
        } else {
            // If there are already songs, add the new song after the current song
            SongNode lastSong = currentSong.prev; // Get the last song
            lastSong.next = newSong; // Link the last song to the new song
            newSong.prev = lastSong; // Link the new song back to the last song
            newSong.next = currentSong; // Link the new song to the current song
            currentSong.prev = newSong; // Link the current song back to the new song
        }

        size++; // Increase the size of the playlist
        System.out.println("Song added: " + songName); // Notify that the song was added
    }

    // This method removes a song from the playlist
    public void removeSong(String songName) {
        if (size == 0) {
            // If the playlist is empty, we can't remove anything
            System.out.println("Playlist is empty. No song to remove.");
            return;
        }

        SongNode current = currentSong; // Start checking from the current song
        do {
            if (current.songName.equals(songName)) {
                // If we found the song to remove
                if (size == 1) {
                    // If it's the only song, clear the current song
                    currentSong = null;
                } else {
                    // Update the links to remove the song from the playlist
                    current.prev.next = current.next; // Link previous song to next song
                    current.next.prev = current.prev; // Link next song to previous song

                    // If the song being removed is the current song, move to the next song
                    if (current == currentSong) {
                        currentSong = current.next; // Move to the next song
                    }
                }
                size--; // Decrease the size of the playlist
                System.out.println("Song '" + songName + "' removed."); // Notify that the song was removed
                return; // Exit the method
            }
            current = current.next; // Move to the next song
        } while (current != currentSong);  // Keep looping until we come back to the current song
        
        // If we finish the loop and didn't find the song
        System.out.println("Song not found in the playlist.");
    }

    // This method moves to the next song in the playlist
    public void nextSong() {
        if (size == 0) {
            // If the playlist is empty, we can't move to the next song
            System.out.println("Playlist is empty.");
            return;
        }
        currentSong = currentSong.next; // Move to the next song
        System.out.println("Now playing: " + currentSong.songName); // Notify which song is now playing
    }

    // This method moves to the previous song in the playlist
    public void previousSong() {
        if (size == 0) {
            // If the playlist is empty, we can't move to the previous song
            System.out.println("Playlist is empty.");
            return;
        }
        currentSong = currentSong.prev; // Move to the previous song
        System.out.println(" Now playing: " + currentSong.songName); // Notify which song is now playing
    }

    // This method displays the current song and the entire playlist
    public void displayPlaylist() {
        if (size == 0) {
            // If the playlist is empty, show a message
            System.out.println("Playlist is empty.");
            return;
        }

        SongNode current = currentSong; // Start from the current song
        System.out.println("Current song: " + currentSong.songName); // Show the current song
        System.out.println("Playlist: "); // Indicate the start of the playlist
        do {
            System.out.println(current.songName); // Print each song in the playlist
            current = current.next; // Move to the next song
        } while (current != currentSong);  // Keep looping until we come back to the current song
    }

    // This is the main method where the program starts
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner to read user input
        PlaylistManager playlist = new PlaylistManager(); // Create a new playlist manager

        while (true) {
            // Show the menu options to the user
            System.out.println("\n=== Music Playlist Manager ===");
            System.out.println("1. Add a song");
            System.out.println("2. Remove a song");
            System.out.println("3. Show current song and playlist");
            System.out.println("4. Move to next song");
            System.out.println("5. Move to previous song");
            System.out.println("6. Exit");

            System.out.print("Choose an option: "); // Prompt user for an option
            int choice = scanner.nextInt(); // Read the user's choice
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // If the user wants to add a song
                    System.out.print("Enter song name to add: ");
                    String songToAdd = scanner.nextLine(); // Read the song name
                    playlist.addSong(songToAdd); // Add the song to the playlist
                    break;

                case 2:
                    // If the user wants to remove a song
                    System.out.print("Enter song name to remove: ");
                    String songToRemove = scanner.nextLine(); // Read the song name
                    playlist.removeSong(songToRemove); // Remove the song from the playlist
                    break;

                case 3:
                    // If the user wants to see the current song and playlist
                    playlist.displayPlaylist(); // Display the playlist
                    break;

                case 4:
                    // If the user wants to move to the next song
                    playlist.nextSong(); // Move to the next song
                    break;

                case 5:
                    // If the user wants to move to the previous song
                    playlist.previousSong(); // Move to the previous song
                    break;

                case 6:
                    // If the user wants to exit the program
                    System.out.println("Exiting the playlist manager."); // Notify the user
                    scanner.close(); // Close the scanner
                    return;  // Exit the program

                default:
                    // If the user enters an invalid option
                    System.out.println("Invalid option. Please try again."); // Show an error message
            }
        }
    }
}

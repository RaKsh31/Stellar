import java.util.*;

public class fit{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total files : ");
        int N = sc.nextInt();
        System.out.println("Tracked files : ");
        int Track = sc.nextInt();
        System.out.println("Ignored files : ");
        int Ign = sc.nextInt();
        System.out.println("tracked arr -> ");
        int trac[] = new int[Track];
        for(int i=0; i<Track; i++)
            trac[i] = sc.nextInt();
        int ignored[] = new int[Ign];
        System.out.println("ignored arr -> ");
        for(int p=0; p<Ign; p++)
            ignored[p] = sc.nextInt();
        // both tracked and ignored
        System.out.println("\nFiles both tracked and ignored: ");
        for (int i = 0; i < Track; i++) {
            for (int j = 0; j < Ign; j++) {
                if (trac[i] == ignored[j]) {
                    System.out.print(trac[i] + " ");
                    break;
                }
            }
        }
        // Count files that are both untracked and ignored
        int untrackedAndIgnoredCount = 0;
        for (int i = 1; i <= N; i++) {
            boolean isTracked = false;
            boolean isIgnored = false;

            // Check if tracked
            for (int j = 0; j < Track; j++) {
                if (trac[j] == i) {
                    isTracked = true;
                    break;
                }
            }
            // Check if ignored
            for (int j = 0; j < Ign; j++) {
                if (ignored[j] == i) {
                    isIgnored = true;
                    break;
                }
            }
// Count untracked and ignored
            if (!isTracked && isIgnored)
                untrackedAndIgnoredCount++;
        }

        System.out.println("\n\nNumber of files both untracked and ignored: " + untrackedAndIgnoredCount);

        sc.close();
    }
}
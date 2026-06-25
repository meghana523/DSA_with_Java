/*public class TowersOfHanoi {
    public static void solveTowersOfHanoi(int n, char from, char aux, char to) {
        if (n == 1) {
            System.out.printf("Move disk 1 from %c to %c\n", from, to);
            return;
        }

        solveTowersOfHanoi(n - 1, from, to, aux);
        System.out.printf("Move disk %d from %c to %c\n", n, from, to);
        solveTowersOfHanoi(n - 1, aux, from, to);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Towers of Hanoi for " + n + " disks:");
        solveTowersOfHanoi(n, 'A', 'B', 'C');
    }
}*/

class TowersOfHanoi
{
    public static int towersOfHanoi(int n,int from, int aux, int to)
    {
        int count=0;
        if(n>0)
        {
            count+=towersOfHanoi(n-1,from,aux,to);
            count++;
            count+=towersOfHanoi(n-1,aux,to,from);
        }
        return count;
    }
}
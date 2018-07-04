class QSort
{
    int partitie(int x[], int min, int max)
    {
        int piv = x[max]; 
        int i = (min-1); 
        for (int j=min; j<max; j++)
        {
            if (x[j] <= piv)
            {
                i++;
                int aux = x[i];
                x[i] = x[j];
                x[j] = aux;
            }
        }

        int aux = x[i+1];
        x[i+1] = x[max];
        x[max] = aux;
 
        return i+1;
    }
 

    void sort(int x[], int min, int max)
    {
        if (min < max)
        {
            int pi = partitie(x, min, max);

            sort(x, min, pi-1);
            sort(x, pi+1, max);
        }
    }
 
    static void print(int x[])
    {
        int n = x.length;
        for (int i=0; i<n; ++i)
            System.out.print(x[i]+" ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        int x[] = {12, 17, 3, 6, 1, 26};
        int n = x.length;
 
        QSort obj = new QSort();
        obj.sort(x, 0, n-1);
 
        System.out.println("sirul sortat");
        print(x);
    }
}
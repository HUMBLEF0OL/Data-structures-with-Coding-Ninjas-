
public class solution {

	public static void towerOfHanoi(int disk, char source, char aux, char dest) {
// base case
		if(disk <= 1)
		{
			// if we have only 1 disk we will always move from source destination
            if(disk==0)
            {
                return;
            }
			System.out.println(source+" "+ dest);
			return;
		}
		
		towerOfHanoi(disk-1,source,dest,aux);
		
		System.out.println(source+" "+ dest);

		
		towerOfHanoi(disk-1,aux,source,dest);

	}
}

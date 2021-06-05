// base case\
		if(arr.length == 0)
			return 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		// initializing the hash map with the default values
		//sum = 0, index = -1
		map.put(0, -1);
		int sum = 0;
		int max = 0;
		for(int i = 0;i<arr.length;i++)
		{
			sum+=arr[i];
			// if the element is already present then we will not insert it again
			if(map.containsKey(sum))
			{
				//if the sum repeats => then sum of element in between must be 0
				int length = i - map.get(sum);
				if(length > max)
					max = length;
			}
			else
				map.put(sum, i);
		}
		System.out.println("Max length is => "+max);
		return max;

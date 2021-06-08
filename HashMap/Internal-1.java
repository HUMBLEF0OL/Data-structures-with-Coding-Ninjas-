if(arr.length== 0)
			return -1;
			
		int maxFreq = 0;
		int number = -1;
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int value = map.get(arr[i]);
				map.put(arr[i],value+1);
			}
			else {
				map.put(arr[i], 1);
				list.add(arr[i]);
			}
		}
		for(int i=0;i<list.size();i++)
		{
			int current = map.get(list.get(i));
			if(maxFreq< current)
			{
				maxFreq = map.get(i);
				number = list.get(i);
			}
		}
		
		return number;

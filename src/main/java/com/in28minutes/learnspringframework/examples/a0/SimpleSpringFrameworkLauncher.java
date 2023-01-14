


class MongoDbDataService implements DataService {
	public int[] retrieveData() {
		return new int[] {11, 22, 33, 44, 55};
	}
}

class MySQLDataService implements DataService {
	public int[] retrieveData() {
		return new int[] {1, 2, 3, 4, 5};
	}
}

class BusinessCalculationService {
	public int findMax() {
		return Arrays.stream.(dataService.retrieveData()).max().orElse(0);
	}
}
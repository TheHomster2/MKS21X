public boolean isDone(){
	for (int row = 0; row < side; row++){
		for (int column = 0; column < side; column++){
			if (value[row][column] > value[row][column + 1] && value[row][column] != 0){
				return false;
}
			else { return true;}
}
}
}

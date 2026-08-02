

int distanceBetweenBusStops(int* distance, int distanceSize, int start, int destination){
    if(start > destination){
        int temp = start;
        start = destination;
        destination = temp;
    }
    int right = 0;
    int left = 0;
    int total = 0;
    for(int i =0; i< distanceSize; i++){
        total+=distance[i];
        if(i>=start && i <destination){
            right+=distance[i];
        }
        left = total - right;
    }
    return (right < left )  ? right : left;
}
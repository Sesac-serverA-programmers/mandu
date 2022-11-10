class lev_01_최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_width=0;
        int max_length=0;
        //가로에 큰값을, 세로에 작은값을
        for(int i = 0; i<sizes.length;i++){
            int tmp =0;
            if(sizes[i][0]>sizes[i][1]){
                tmp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=tmp;
            }
        }
        for(int i = 0; i<sizes.length;i++){
            if(max_width<sizes[i][0]){
                max_width=sizes[i][0];
            }
            if(max_length<sizes[i][1]){
                max_length=sizes[i][1];
            }
        }
        answer = max_length*max_width;

        return answer;
    }
}
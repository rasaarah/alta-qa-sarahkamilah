class Problem7Mean{
    private static float Mean(float[] numbers){
        int sum = 0;
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            sum += numbers[i];
        }
        return (float)sum / (float)n;
    }

    public static void main(String[] args) {
        float[] value= {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
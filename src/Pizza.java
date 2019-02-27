public class Pizza {
    private int height;
    private int width;
    private int minOfEachIngredient;
    private int maxCellsPerSlice;

    public Pizza(int width, int height, int minOfEachIngredient, int maxCellsPerSlice){
        this.height = height;
        this.width = width;
        this.minOfEachIngredient = minOfEachIngredient;
        this.maxCellsPerSlice = maxCellsPerSlice;
    }

    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }

    public int getMinOfEachIngredient(){
        return minOfEachIngredient;
    }

    public int getMaxCellsPerSlice(){
        return maxCellsPerSlice;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setMinOfEachIngredient(int minOfEachIngredient){
        this.minOfEachIngredient = minOfEachIngredient;
    }

    public void setMaxCellsPerSlice(int maxCellsPerSlice){
        this.maxCellsPerSlice = maxCellsPerSlice;
    }

    public void set
}

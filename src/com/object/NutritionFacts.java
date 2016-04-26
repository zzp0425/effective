package com.object;

/**
 * Created by 周振平
 * on 2016/4/10 0:35
 * 营养表
 */
public class NutritionFacts {
    private final int servingSize;//每份大小
    private final int servings;//份数
    private final int calories;//卡路里
    private final int fat;//脂肪
    private final int sodium;//钠
    private final int carbohydrate;//碳水化合物

    public static class Builder {
        //required parameters必输字段
        private final int servingSize;//每份大小
        private final int servings;//份数

        //optional parameters - initialized to default values;
        //可选参数  初始化默认值
        private int calories = 0;//卡路里
        private int fat = 0;//脂肪
        private int sodium = 0;//钠
        private int carbohydrate = 0;//碳水化合物

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    public NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.carbohydrate = builder.carbohydrate;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8).
                calories(100).carbohydrate(10).fat(6).sodium(77).build();
    }


}

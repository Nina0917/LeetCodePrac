package arrayStringSpecializedChapter.chapter3;

public class Demo03 {
    public static void main(String[] args) {
        String s="a good   example";
        s = s.trim();

        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i]=split[i].trim();
        }
        split = reverse(split);

        //System.out.println(Arrays.toString(split));
        StringBuilder sb = new StringBuilder();
        for(String str:split){
            if (!str.isEmpty()){
                sb.append(str);
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }
    public static String[] reverse(String[] arr){
        // 遍历数组
        for(int i = 0;i < arr.length / 2;i++){
            // 交换元素
            String temp = arr[arr.length -i - 1];
            arr[arr.length -i - 1] = arr[i];
            arr[i] = temp;
        }
        // 返回反转后的结果
        return arr;
    }
}

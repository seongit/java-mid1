package lang.wrapper.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LotteGenerator generator = new LotteGenerator();
        int[] lottoNumbers = generator.generate();

        // 생성된 로또 번호 출력
        System.out.print("로또 번호 : ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}

package lessons.java101.abstractclass;

public class FileSmileProcessor extends AbstractSmileProcessor {

    @Override
    public String readString() {
        return "Hello:(:)";
    }

    public static void main(String[] args) {
        final FileSmileProcessor fileSmileProcessor = new FileSmileProcessor();

        // вызываем методо process которй вызовет метод абстрактный readString, который переопределен
        // в классе FileSmileProcessor
        fileSmileProcessor.process();


    }

}

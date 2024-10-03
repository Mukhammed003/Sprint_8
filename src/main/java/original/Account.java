package original;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if(name.length() >= 3 && name.length() <= 19) {
            if(name.charAt(0) != ' ' && name.charAt(name.length() - 1) != ' ') {
                if(name.indexOf(' ') != -1 && name.indexOf(' ') == name.lastIndexOf(' ')) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

}

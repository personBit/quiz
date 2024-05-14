package Quizz;

public class HardMode {
    public static void hardMode() {
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nКакой язык программирования относится к функциональному типу?: \n1) Python\n2) Java\n3) Haskell\n4) C++\n", "3"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nВерно, идем дальше! Какая структура данных используется для реализации очереди с приоритетом?: \n1) Список\n2) Дерево\n3) Куча (Heap)\n4) Граф\n", "3"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nВерно, идем дальше! Какая структура данных используется для представления графов?: \n1) Стек\n2) Очередь\n3) Список\n4) Матрица смежности\n", "4"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nВерно, идем дальше! Какая функция языка Python используется для чтения данных из файла?: \n1) open()\n2) read()\n3) input()\n4) load()\n", "1"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nВерно, идем дальше! Какой алгоритм используется для поиска кратчайшего пути во взвешенном графе?: \n1) BFS\n2) DFS\n3) Dijkstra\n4) A*\n", "3"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nВерно, 5 вопросов позади, идем дальше! Какая система счисления используется в компьютерах?: \n1) Десятичная\n2) Двоичная\n3) Шестнадцатеричная\n4) Восьмеричная\n", "2"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nВерно, идем дальше! Как называется процесс преобразования IP-адреса в MAC-адрес в сети Ethernet?: \n1) ARP\n2) ICMP\n3) TCP\n4) UDP\n", "1"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nВерно, идем дальше! Какой оператор в языке программирования C++ используется для выделения динамической памяти?: \n1) new\n2) malloc\n3) alloc\n4) create\n", "1"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nСтранно, вы опять ответили верно! Какой из перечисленных языков программирования является интерпретируемым?: \n1) Java\n2) C++\n3) Python\n4) C#\n", "3"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nСегодня сходите в казино, это благой совет. Какой алгоритм используется для определения связности графа?: \n1) Поиск в ширину (BFS)\n2) Поиск в глубину (DFS)\n3) Алгоритм Прима\n4) Алгоритм Крускала\n", "1"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nИ снова верно, как у вас это получается? Какая структура данных используется для реализации стека?: \n1) Массив\n2) Связанный список\n3) Дерево\n4) Очередь\n", "1"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nВы - Удача? Какая операция выполняется при использовании метода \"push\" для стека?: \n1) Добавление элемента в начало\n2) Добавление элемента в конец\n3) Удаление элемента из начала\n4) Удаление элемента из конца\n", "2"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nПользование сторонними источниками информации запрещается... Как называется процесс преобразования исходного кода программы в машинный код?: \n1) Компиляция\n2) Интерпретация\n3) Трансляция\n4) Сборка\n", "1"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nПредпоследний вопрос, и мы не верим в вас. Какие из перечисленных языков являются статически типизированными?: \n1) Python\n2) JavaScript\n3) Java\n4) Ruby\n", "3"), true);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nПоследний вопрос, но как же ваша совесть? Какое преимущество имеет использование динамической памяти по сравнению с статической?: \n1) Быстрый доступ к данным\n2) Экономия памяти\n3) Гибкое управление памятью\n4) Повышенная безопасность\n", "3"), true);

        System.out.println("\n\nнавряд-ли кто-то это увидет, но: это конец.");
    }
}

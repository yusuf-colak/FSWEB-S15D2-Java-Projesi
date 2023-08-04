#  Java Sets

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### 1-)Set Challenge

 * İki tane sınıfımız olucak. ```Task``` ve ```TaskData```
 * ```Task``` sınıfı içerisinde 5 tane ```instance variable``` olmalı. ```project``` => string ```description``` => string ```assignee``` => string
 * ```priority``` Priority şeklinde bir Enum tipinde olmalı. Priority{HIGH, MED, LOW} şeklinde oluşturabilirsiniz.
 * ```status``` Status şeklinde bir Enum tipinde olmalı. Status{IN_QUEUE, ASSIGNED, IN_PROGRESS} şeklinde oluşturabilirsiniz.
 * Task'ın eşsizliğini ```project``` ve ```description``` değerleri birlikte belirler.
 * TaskData sınıfı 3 tane değişkene sahip olmalı  ```annsTasks => Set<Task>```   ```bobsTasks => Set<Task>```  ```carolsTasks => Set<Task>``` 
 * TaskData sınıfı ```getTasks()``` adlı bir metoda sahip olmalı. method parametre olarak bir String almalı. Bu 4 değerden herhangi birini alabilir. ("ann", "bob", "carol", "all") Metodun dönüş değeri ```Set<Task>``` olmalı.
 
### Senaryo

* Şöyle bir senaryomuz var. Sen şirketteki yeni bir yöneticisin ve ekibinde 3 tane çalışanın var.
* Ann, Bob, Carol 3'ü de senin çalışanların.
* Üç yazılımcı da farklı task sahipleri.
* Siz bütün yazılımcılara ellerindeki taskları yollamalarını istediniz.
* Bunlar bir ```set``` içerisinde tutulabilir. Sende bu taskları kendi müdürüne raporluyorsun.

 Müdürüne şu soruların cevabını verebilmelisin:
* Tüm çalışanlarının üzerindeki tasklar nelerdir ?
* Her bir çalışanın üzerindeki tasklar nelerdir ?
* Herhangi bir çalışana atanması yapılmamış olan tasklar nelerdir ?
* Birden fazla çalışana atanmış task var mı ? Varsa bunlar hangileri ?

* Bu görevleri yapabilmek aşağıdaki metodları yazmalısın
* ```getUnion()``` metodu bir set listesi alır ve aldığı tüm set değerlerini union ile birleştirip döner.
* ```getIntersect()``` metodu iki tane set alır ve aralarındaki kesişim kümesini bulup döner.
* ```getDifference()``` metodu iki tane set alır ve ikinci set içerisindeki verileri ilk set içerisindeki verilerden çıkarır.


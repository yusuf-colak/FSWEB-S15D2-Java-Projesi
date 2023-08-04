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
 * TaskData sınıfı 3 tane değişkene sahip olmalı ```tasks``` => String, ```annsTasks``` => String, ```bobsTasks``` => String, ```carolsTasks``` => String
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

### 2-)Theatre Challenge

* Bu örnekte bir Tiyatro salonu dizayn edeceğiz. içersinde koltuklar kümesi olacak. ```Set<Seat>```
* ```Theatre``` isimli bir sınıf oluşturunuz. ```Seat``` isimli bir sınıf oluşturunuz.
* ```Seat``` sınıfının 3 değişkeni olmalı. ```row``` => char ```seat_no``` => int. Koltuklar şu şekilde gösterilmeli 'A005','B102','A012'. ```is_reserved``` => boolean
* Tiyatro sınıfında üç alan, tiyatro adı, sıradaki koltuklar için bir tamsayı, bir başka deyişle tek sırada kaç koltuk var ve koltukların kendileri için bir alan olmalıdır.
* Son alan ```TreeSet``` olarak tanımlanmalı.
* ```Theatre``` sınıfı kullanılarak bir instance oluşturulmak istenirse, tiyatro adı, tiyatrodaki sıra sayısı ve tiyatrodaki toplam koltuk sayısı birlikte kullanılarak oluşturulmalıdır.
* Basit olması için, her sırada aynı sayıda koltuk olduğunu ve sıra sayısının asla 26'yı geçmemesi gerektiğini varsayalım, bu nedenle sıralar A'dan Z'ye kadar etiketlenecektir.

* Bir tiyatro sınıfının oluştrulması esnasında koltukları oluşturmalı ve numaralandırmalısınız.
* ```Theatre``` sınıfı içerisinde ```printSeatMap``` isimli bir metod yazmalıyız. her koltuğu ayrı bir satıra yazdırmalı.
* Bir rezervasyon acentesinin tek bir koltuk ayırmasına izin vermelisiniz. Daha sonra ```printSeatMap```metodu ile hangi koltukların rezerve olduğunu göstermelisiniz.

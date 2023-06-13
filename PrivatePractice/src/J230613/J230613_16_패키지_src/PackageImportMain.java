import com.itwill.shop.ShopService;
/*
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
*/
import com.itwill.shop.member.*;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;//코드에 기술된 순서임



/*
            << The import com.itwill.shop.admin.Product collides with another import statement >>
import com.itwill.shop.admin.Product;
            패키지를 제외한 클래스이름이 동일한클래스는 둘다 import가 불가능하다
            위에 shop.rpoduct.Product때문에....
*/


public class PackageImportMain {

	public static void main(String[] args) {
		
		/*
		 * <<자동 import단축키>>
		 * 
		 * ctrl + shift + o
		 */
		
		
		
		
		
		// ShopService 클래스를 import하여 사용할 수 있도록 선언
		ShopService shopService = new ShopService();
		System.out.println(shopService);
		
		// Member 클래스를 import하여 사용할 수 있도록 선언
		Member member = new Member();
		// import com.itwill.shop.member.*; 문장을 사용하면 패키지 이름을 생략할 수도 있습니다.
		System.out.println(member);
		 
		// MemberService 클래스를 import하여 사용할 수 있도록 선언
		MemberService memberService = new MemberService();
		System.out.println(memberService);
		
		System.out.println("-----------com.itwill.shop.product.Product,com.itwill.shop.product.ProductService--------------");
		
		Product shopProduct = new Product(); 
		System.out.println(shopProduct);
		
		ProductService ProductService = new ProductService(); 
		System.out.println(ProductService);
		
		
		
		System.out.println("--------------com.itwill.shop.admin.Product,com.itwill.shop.admin.ProductService---------------------");
		
		com.itwill.shop.admin.Product adminProduct = new com.itwill.shop.admin.Product(); //  패키지를 제외한 클래스이름이 동일한클래스는 둘다 import가 불가능하다	
																						  //위에 shop.rpoduct.Product때문에....
		System.out.println(adminProduct);
		
		com.itwill.shop.admin.ProductService adminProductService = new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);
		
		
	}
}
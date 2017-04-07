package com.controller;

import java.util.ArrayList;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.CancelledOrderInfo;
import com.model.ComplitedOrderInfo;
import com.model.CustomerInfo;
import com.model.FileToArray;
import com.model.InventaryInfo;
import com.model.Mapping;
import com.model.OrderInfo;
import com.model.PaymentInfo;
import com.model.ProLevel;
import com.model.Product;
import com.model.ProductLevelMapping;
import com.model.ProductTypeLevel;
import com.model.PurchaseInfo;
import com.model.RefundedOrderInfo;
import com.model.SalesInfo;
import com.model.sql.UserMaster;
import com.model.sql.orders;
import com.repository.ProductMongoRepository;
import com.repository.ProductSearchRepository;
import com.repository.CancelledOrderMongoRepository;
import com.repository.CompletedOrderMongoRepository;
import com.repository.CustomerMongoRepository;
import com.repository.InventaryMongoRepository;
import com.repository.OrderMongoRepository;
import com.repository.OrderMongoRepositoryImpl;
import com.repository.PaymentMongoRepository;
import com.repository.ProductMapping;
import com.repository.ProductTypeLevelMongoRepository;
import com.repository.PurchaseMongoRepository;
import com.repository.RefundOrderMongoRepository;
import com.repository.SaleMongoRepository;
import com.service.sql.OrderMasterService;
import com.service.sql.UserMasterService;

@RestController
public class MainController {

	@Autowired
	ProductMongoRepository productRepository;
	@Autowired
	ProductTypeLevelMongoRepository ProductTypeLevelMongoRepository;
	@Autowired
	ProductMapping productMapping;
	@Autowired
	SaleMongoRepository  saleMongoRepository;
	@Autowired
	PurchaseMongoRepository purchaseMongoRepository;
	@Autowired
	CustomerMongoRepository customerMongoRepository;
	@Autowired
	PaymentMongoRepository paymentMongoRepository;
	@Autowired 
	InventaryMongoRepository inventaryMongoRepository;
	@Autowired 
	OrderMongoRepository orderMongoRepository;
	@Autowired 
	CancelledOrderMongoRepository cancelledOrderMongoRepository;
	@Autowired
	CompletedOrderMongoRepository completedOrderMongoRepository;
	@Autowired
	RefundOrderMongoRepository refundOrderMongoRepository;
	///sql service
	@Autowired 
	UserMasterService userMasterService;
	@Autowired
	OrderMasterService orderMasterService;

	@RequestMapping("/home")
	public @ResponseBody ResponseEntity<ArrayList<Product>> home(Model model) {
		model.addAttribute("carList", productRepository.findAll());
		ArrayList<Product> array = (ArrayList<Product>) productRepository.findAll();
		return new ResponseEntity<ArrayList<Product>>(array, HttpStatus.OK);
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String addProduct() {
		List<String> list = FileToArray.getFileToArray();
		for (String string : list) {
			Product product = new Product();
			product.setName(string);
			System.out.println(product + "{}}}}}}}}}}}}}}}}}}}}}}}}}");
			productRepository.save(product);
		}

		return "redirect:home";
	}
	
	@RequestMapping(value = "/MapUserSqlToUserMongodb", method = RequestMethod.POST)
	public String MapUserSqlToUserMongodb() {
		ArrayList<UserMaster> array = (ArrayList<UserMaster>) userMasterService.getUser();
		for (UserMaster userMaster : array) {
			CustomerInfo customerInfo=new CustomerInfo();
			customerInfo.setEmail(userMaster.getUser_email());
			customerInfo.setExternalCustomerdId(userMaster.getId());
			customerMongoRepository.save(customerInfo);
		}
	
	//paymentMongoRepository.save(new PaymentInfo());
	//saleMongoRepository.save(new SalesInfo());
	//purchaseMongoRepository.save(new PurchaseInfo());
	//inventaryMongoRepository.save(new InventaryInfo());
	

		return "redirect:home";
	}
	@RequestMapping(value = "/mapOrderToMOngoDbOrderscomplited", method = RequestMethod.GET)
	public String mapOrderToMOngoDbOrders() {
		ArrayList<orders> array = (ArrayList<orders>) orderMasterService.getOrderWithStatusComplited();
		for (orders orders : array) {
			OrderInfo orderInfo=new OrderInfo();
			orderInfo.setObjectId(orders.getOrder_id());
			orderInfo.setOrderDate(orders.getCreated_date());
			orderMongoRepository.save(orderInfo);
			
			ComplitedOrderInfo complitedOrderInfo=new ComplitedOrderInfo();
			complitedOrderInfo.setObjectId(orders.getOrder_id());
			completedOrderMongoRepository.save(complitedOrderInfo);
			PurchaseInfo purchaseInfo =new PurchaseInfo();
            purchaseInfo.setOrderId(orders.getOrder_id());
            purchaseInfo.setDateOfPurchase(orders.getCreated_date());
            PaymentInfo paymentInfo=new PaymentInfo();
            paymentInfo.setOrderId(orders.getOrder_id());
            paymentInfo.setCurrancy(orders.getCurrency());
            paymentInfo.setDiscountAmt(orders.getDiscount());
            paymentInfo.setTax(orders.getTax());
            paymentInfo.setPaymentMethod(orders.getPayment_method());
            paymentInfo.setAmount(orders.getTotal());
		
		}
	
	

		return "redirect:home";
	}
	@RequestMapping(value = "/mapOrderToMOngoDbOrdersCancelled", method = RequestMethod.GET)
	public String mapOrderToMOngoDbOrdersCancelled() {
		ArrayList<orders> array = (ArrayList<orders>) orderMasterService.getOrderWithStatusCancelled();
		for (orders orders : array) {
			OrderInfo orderInfo=new OrderInfo();
			orderInfo.setObjectId(orders.getOrder_id());
			orderInfo.setOrderDate(orders.getCreated_date());
			orderMongoRepository.save(orderInfo);
			CancelledOrderInfo cancelledOrderInfo=new CancelledOrderInfo();
			cancelledOrderInfo.setObjectId(orders.getOrder_id());
			cancelledOrderMongoRepository.save(cancelledOrderInfo);
			
		
		}
	
	

		return "redirect:home";
	}
	@RequestMapping(value = "/mapOrderToMOngoDbOrdersRefund", method = RequestMethod.GET)
	public String mapOrderToMOngoDbOrdersRefund() {
		ArrayList<orders> array = (ArrayList<orders>) orderMasterService.getOrderWithStatusCancelled();
		for (orders orders : array) {
			OrderInfo orderInfo=new OrderInfo();
			orderInfo.setObjectId(orders.getOrder_id());
			orderInfo.setOrderDate(orders.getCreated_date());
			orderMongoRepository.save(orderInfo);
			RefundedOrderInfo  refundedOrderInfo=new RefundedOrderInfo();
			refundedOrderInfo.setObjectId(orders.getOrder_id());
			refundedOrderInfo.setParentObjectId(orders.getParent_id());
			refundOrderMongoRepository.save(refundedOrderInfo);
		
		}
	
	

		return "redirect:home";
	}

	@RequestMapping(value = "/addTypeLevel", method = RequestMethod.POST)
	public String addTypeLevel() {
		List<ProLevel> list = FileToArray.getFileToArrayForLevel();
		for (ProLevel object : list) {
			ProductTypeLevel productTypeLevel = new ProductTypeLevel();
			productTypeLevel.setLevel(object.getLevel());
			productTypeLevel.setName(object.getName());
			System.out.println(productTypeLevel + "{}}}}}}}}}}}}}}}}}}}}}}}}}");
			ProductTypeLevelMongoRepository.save(productTypeLevel);
		}

		return "redirect:home";
	}

	@RequestMapping(value = "/addTypeLevelMapping", method = RequestMethod.POST)
	public String addTypeLevelMapping() {
	
		List<Mapping> list = FileToArray.getFileToArrayForMapping();
		for (Mapping object : list) {
			System.out.println("***********************************************************************");
				for (String mappingIndex : object.getMapping()) {
					ProductLevelMapping productLevelMapping = new ProductLevelMapping();
					System.out.println(":::::::::::Mapping:::::::::::::::::"+mappingIndex+":::::::Return from ProductLevelType:::::::::::::::::"+ProductTypeLevelMongoRepository.returnProductLevelForMapping(mappingIndex));
					productLevelMapping.setProductTypeLevelId(ProductTypeLevelMongoRepository.returnProductLevelForMapping(mappingIndex).getId()); 
					System.out.println(":::::::::::::::Name:::::::::::"+object.getName()+":::::::::::::::Return from Product:::::::::::"+productRepository.returnProductForMapping(object.getName()).getId());
					productLevelMapping.setProductId(productRepository.returnProductForMapping(object.getName()).getId());
					
					
			         productMapping.save(productLevelMapping);
				}
				
				System.out.println("***********************************************************************");
			
		}
		
		return "redirect:home";
	}
	
	

	
	@RequestMapping(value = "/saveSqlData")
	public String saveSqlData() {
		UserMaster user=new UserMaster();
		//user.setEmail("pallavi@gmail.com");
		//user.setFirstName("pallavi");
		userMasterService.saveUser(user);
		return "home";
	}
	

	@RequestMapping("/readSqlData")
	public @ResponseBody ResponseEntity<ArrayList<UserMaster>> readSqlData() {
		
		ArrayList<UserMaster> array = (ArrayList<UserMaster>) userMasterService.getUser();
		return new ResponseEntity<ArrayList<UserMaster>>(array, HttpStatus.OK);
	}
	
	
	
}

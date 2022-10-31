package com.kwei.springboot.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 *  將配置文件中配置的屬性值, 映射到當前Bean組件中.
 *  @ConfigurationProperties: 通知SpringBoot將本類中屬性與'配置文件'中的相關配置進行綁定
 * 		prefix屬性: 配置文件中的變量名
 * 		補充: @ConfigurationProperties: 從全局配置文件中獲取值
 * @author a8566
 *
 */
@Component
@ConfigurationProperties(prefix="person") //獲取配置文件的數據M1
@Validated // 數據校驗
public class Person {

	/**
	 *  <bean class="Person">
	 *  	<property name="lastName" value="字面量/${key}配值文件/#{SpEL}" />
	 *  </bean>
	 */
	//@Value("${person.lastName}") //獲取配置文件的數據M2
	//@Email //校驗
	private String lastName;
	//@Value("#{3*10}")
	private Integer age;
	//@Value("true")
	private Boolean isBoss;
	private Date birth;
	
	private Map<String,Object> map;
	private List<Object> list;
	
	private Dog dog;
	
	public Person() {
		super();
	}

	public Person(String lastName, Integer age, Boolean isBoss, Date birth, Map<String, Object> map, List<Object> list,
			Dog dog) {
		super();
		this.lastName = lastName;
		this.age = age;
		this.isBoss = isBoss;
		this.birth = birth;
		this.map = map;
		this.list = list;
		this.dog = dog;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsBoss() {
		return isBoss;
	}

	public void setIsBoss(Boolean isBoss) {
		this.isBoss = isBoss;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", isBoss=" + isBoss + ", birth=" + birth + ", map="
				+ map + ", list=" + list + ", dog=" + dog + "]";
	}
	
	
}

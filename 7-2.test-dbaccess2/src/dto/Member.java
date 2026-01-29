package dto;

/**
 * メンバー情報を表すDTO.
 * 
 * @author igamasayuki
 *
 */
public class Member {
	/** ID */
	
	/** 名前 */
	
	/** 年齢 */
	
	/** 部署ID */

 String name; 
Integer age;
 Integer dep_id;
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public Integer getAge() {
	return age;
 }
 public void setAge(Integer age) {
	this.age = age;
 }
 public Integer getDep_id() {
	return dep_id;
 }
 public void setDep_id(Integer dep_id) {
	this.dep_id = dep_id;
 }
}

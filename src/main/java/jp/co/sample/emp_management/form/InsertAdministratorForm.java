package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前は必須です")
	private String name;
	/** メールアドレス */
	@Email(message = "Eメールの形式が不正です")
	@Size(min = 5, max = 127, message = "Eメールは5文字以上127文字以内で記載してください")
	private String mailAddress;
	/** パスワード */
	@Size(min = 5, max = 127, message = "パスワードは5文字以上127文字以内で記載してください")
	private String password;
	/** 確認用パスワード */
	@Size(min = 5, max = 127, message = "確認用パスワードは5文字以上127文字以内で記載してください")
	private String conPassword;

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", conPassword=" + conPassword + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress the mailAddress to set
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the conPassword
	 */
	public String getConPassword() {
		return conPassword;
	}

	/**
	 * @param conPassword the conPassword to set
	 */
	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
	}

}
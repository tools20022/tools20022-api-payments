/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TransactionChannelCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of communication channel.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#MailOrder
 * TransactionChannelCode.mmMailOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#TelephoneOrder
 * TransactionChannelCode.mmTelephoneOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#ElectronicCommerce
 * TransactionChannelCode.mmElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#TelevisionPayment
 * TransactionChannelCode.mmTelevisionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#OfficeOrBranch
 * TransactionChannelCode.mmOfficeOrBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#HomeBanking
 * TransactionChannelCode.mmHomeBanking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#FinancialAdvisor
 * TransactionChannelCode.mmFinancialAdvisor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#MobilePayment
 * TransactionChannelCode.mmMobilePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#SecuredElectronicCommerce
 * TransactionChannelCode.mmSecuredElectronicCommerce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode#MobilePOS
 * TransactionChannelCode.mmMobilePOS}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
 * TransactionChannel1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionChannelCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of communication channel."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionChannelCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Mail order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mail order."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode MailOrder = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailOrder";
			definition = "Mail order.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "MAIL";
		}
	};
	/**
	 * Telephone order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TLPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelephoneOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Telephone order."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode TelephoneOrder = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelephoneOrder";
			definition = "Telephone order.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "TLPH";
		}
	};
	/**
	 * Electronic commerce.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic commerce."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode ElectronicCommerce = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicCommerce";
			definition = "Electronic commerce.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "ECOM";
		}
	};
	/**
	 * Payment on television.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TVPY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelevisionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment on television."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode TelevisionPayment = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelevisionPayment";
			definition = "Payment on television.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "TVPY";
		}
	};
	/**
	 * Office or branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficeOrBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Office or branch."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode OfficeOrBranch = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficeOrBranch";
			definition = "Office or branch.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "BRAN";
		}
	};
	/**
	 * Home banking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeBanking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Home banking."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode HomeBanking = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeBanking";
			definition = "Home banking.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "HOBA";
		}
	};
	/**
	 * Financial advisor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvisor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial advisor."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode FinancialAdvisor = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvisor";
			definition = "Financial advisor.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "FIAD";
		}
	};
	/**
	 * Payment performed through a cardholder mobile device.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment performed through a cardholder mobile device."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode MobilePayment = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePayment";
			definition = "Payment performed through a cardholder mobile device.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "MOBL";
		}
	};
	/**
	 * Electronic commerce with cardholder authentication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuredElectronicCommerce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic commerce with cardholder authentication."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode SecuredElectronicCommerce = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredElectronicCommerce";
			definition = "Electronic commerce with cardholder authentication.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "SECM";
		}
	};
	/**
	 * Payment performed through a merchant mobile device.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment performed through a merchant mobile device."</li>
	 * </ul>
	 */
	public static final TransactionChannelCode MobilePOS = new TransactionChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePOS";
			definition = "Payment performed through a merchant mobile device.";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionChannelCode.mmObject();
			codeName = "MPOS";
		}
	};
	final static private LinkedHashMap<String, TransactionChannelCode> codesByName = new LinkedHashMap<>();

	protected TransactionChannelCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionChannelCode";
				definition = "Specifies the type of communication channel.";
				derivation_lazy = () -> Arrays.asList(TransactionChannel1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionChannelCode.MailOrder, com.tools20022.repository.codeset.TransactionChannelCode.TelephoneOrder,
						com.tools20022.repository.codeset.TransactionChannelCode.ElectronicCommerce, com.tools20022.repository.codeset.TransactionChannelCode.TelevisionPayment,
						com.tools20022.repository.codeset.TransactionChannelCode.OfficeOrBranch, com.tools20022.repository.codeset.TransactionChannelCode.HomeBanking,
						com.tools20022.repository.codeset.TransactionChannelCode.FinancialAdvisor, com.tools20022.repository.codeset.TransactionChannelCode.MobilePayment,
						com.tools20022.repository.codeset.TransactionChannelCode.SecuredElectronicCommerce, com.tools20022.repository.codeset.TransactionChannelCode.MobilePOS);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MailOrder.getCodeName().get(), MailOrder);
		codesByName.put(TelephoneOrder.getCodeName().get(), TelephoneOrder);
		codesByName.put(ElectronicCommerce.getCodeName().get(), ElectronicCommerce);
		codesByName.put(TelevisionPayment.getCodeName().get(), TelevisionPayment);
		codesByName.put(OfficeOrBranch.getCodeName().get(), OfficeOrBranch);
		codesByName.put(HomeBanking.getCodeName().get(), HomeBanking);
		codesByName.put(FinancialAdvisor.getCodeName().get(), FinancialAdvisor);
		codesByName.put(MobilePayment.getCodeName().get(), MobilePayment);
		codesByName.put(SecuredElectronicCommerce.getCodeName().get(), SecuredElectronicCommerce);
		codesByName.put(MobilePOS.getCodeName().get(), MobilePOS);
	}

	public static TransactionChannelCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionChannelCode[] values() {
		TransactionChannelCode[] values = new TransactionChannelCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionChannelCode> {
		@Override
		public TransactionChannelCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionChannelCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
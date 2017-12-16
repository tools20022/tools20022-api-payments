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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContactDetails2;
import com.tools20022.repository.msg.ContactDetails3;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Collection of information that identifies a phone address.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PhoneAddress" src="doc-files/PhoneAddress.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PhoneAddress#mmPhoneNumber
 * PhoneAddress.mmPhoneNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhoneAddress#mmFaxNumber
 * PhoneAddress.mmFaxNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhoneAddress#mmMobileNumber
 * PhoneAddress.mmMobileNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PhoneAddress"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Collection of information that identifies a phone address."</li>
 * </ul>
 */
public class PhoneAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text phoneNumber;
	/**
	 * Collection of information that identifies a phone number, as defined by
	 * telecom services.<br>
	 * It is recommended to use only numbers and limited punctuation +,-.(.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails2#mmPhoneNumber
	 * ContactDetails2.mmPhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#mmPhoneNumber
	 * ContactDetails3.mmPhoneNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress PhoneAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPhoneNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ContactDetails2.mmPhoneNumber, ContactDetails3.mmPhoneNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PhoneAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PhoneAddress.class.getMethod("getPhoneNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text faxNumber;
	/**
	 * Collection of information that identifies a FAX number, as defined by
	 * telecom services.<br>
	 * It is recommended to use only numbers and limited punctuation +,-.(.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails2#mmFaxNumber
	 * ContactDetails2.mmFaxNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#mmFaxNumber
	 * ContactDetails3.mmFaxNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress PhoneAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaxNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a FAX number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFaxNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ContactDetails2.mmFaxNumber, ContactDetails3.mmFaxNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PhoneAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PhoneAddress.class.getMethod("getFaxNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text mobileNumber;
	/**
	 * Collection of information that identifies a mobile phone number, as
	 * defined by telecom services.<br>
	 * It is recommended to use only numbers and limited punctuation +,-.(.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails2#mmMobileNumber
	 * ContactDetails2.mmMobileNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#mmMobileNumber
	 * ContactDetails3.mmMobileNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PhoneAddress PhoneAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobileNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of information that identifies a mobile phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMobileNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ContactDetails2.mmMobileNumber, ContactDetails3.mmMobileNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PhoneAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MobileNumber";
			definition = "Collection of information that identifies a mobile phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PhoneAddress.class.getMethod("getMobileNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PhoneAddress";
				definition = "Collection of information that identifies a phone address.";
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PhoneAddress.mmPhoneNumber, com.tools20022.repository.entity.PhoneAddress.mmFaxNumber, com.tools20022.repository.entity.PhoneAddress.mmMobileNumber);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PhoneAddress.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Max35Text phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Max35Text getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(Max35Text faxNumber) {
		this.faxNumber = faxNumber;
	}

	public Max35Text getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Max35Text mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
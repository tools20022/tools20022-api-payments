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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ContactPoint;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PhoneAddress#PhoneNumber
 * PhoneAddress.PhoneNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhoneAddress#FaxNumber
 * PhoneAddress.FaxNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhoneAddress#MobileNumber
 * PhoneAddress.MobileNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContactDetails2#PhoneNumber
	 * ContactDetails2.PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#PhoneNumber
	 * ContactDetails3.PhoneNumber}</li>
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
	public static final MMBusinessAttribute PhoneNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails2.PhoneNumber, com.tools20022.repository.msg.ContactDetails3.PhoneNumber);
			elementContext_lazy = () -> PhoneAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#FaxNumber
	 * ContactDetails2.FaxNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#FaxNumber
	 * ContactDetails3.FaxNumber}</li>
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
	public static final MMBusinessAttribute FaxNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails2.FaxNumber, com.tools20022.repository.msg.ContactDetails3.FaxNumber);
			elementContext_lazy = () -> PhoneAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.ContactDetails2#MobileNumber
	 * ContactDetails2.MobileNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#MobileNumber
	 * ContactDetails3.MobileNumber}</li>
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
	public static final MMBusinessAttribute MobileNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContactDetails2.MobileNumber, com.tools20022.repository.msg.ContactDetails3.MobileNumber);
			elementContext_lazy = () -> PhoneAddress.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MobileNumber";
			definition = "Collection of information that identifies a mobile phone number, as defined by telecom services.\r\nIt is recommended to use only numbers and limited punctuation +,-.(.).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PhoneAddress";
				definition = "Collection of information that identifies a phone address.";
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PhoneAddress.PhoneNumber, com.tools20022.repository.entity.PhoneAddress.FaxNumber, com.tools20022.repository.entity.PhoneAddress.MobileNumber);
			}
		});
		return mmObject_lazy.get();
	}
}
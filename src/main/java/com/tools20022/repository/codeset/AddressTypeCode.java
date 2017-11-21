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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of address.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode#mmResidential
 * AddressTypeCode.mmResidential}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AddressTypeCode#mmBusiness
 * AddressTypeCode.mmBusiness}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AddressTypeCode#mmPostal
 * AddressTypeCode.mmPostal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AddressTypeCode#mmPOBox
 * AddressTypeCode.mmPOBox}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AddressTypeCode#mmMailTo
 * AddressTypeCode.mmMailTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode#mmDeliveryTo
 * AddressTypeCode.mmDeliveryTo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AddressType2Code
 * AddressType2Code}</li>
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
 * <li>"HOME"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AddressTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of address."</li>
 * </ul>
 */
public class AddressTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Address is the home address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residential"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is the home address."</li>
	 * </ul>
	 */
	public static final MMCode mmResidential = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Residential";
			definition = "Address is the home address.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "HOME";
		}
	};
	/**
	 * Address is the business address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIZZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Business"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is the business address."</li>
	 * </ul>
	 */
	public static final MMCode mmBusiness = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Business";
			definition = "Address is the business address.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "BIZZ";
		}
	};
	/**
	 * Address is the complete postal address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Postal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is the complete postal address."</li>
	 * </ul>
	 */
	public static final MMCode mmPostal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Postal";
			definition = "Address is the complete postal address.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "ADDR";
		}
	};
	/**
	 * Address is a postal office (PO) box.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PBOX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POBox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is a postal office (PO) box."</li>
	 * </ul>
	 */
	public static final MMCode mmPOBox = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "POBox";
			definition = "Address is a postal office (PO) box.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "PBOX";
		}
	};
	/**
	 * Address is the address to which mail is sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address is the address to which mail is sent."</li>
	 * </ul>
	 */
	public static final MMCode mmMailTo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailTo";
			definition = "Address is the address to which mail is sent.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "MLTO";
		}
	};
	/**
	 * Address is the address to which delivery is to take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AddressTypeCode
	 * AddressTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLVY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address is the address to which delivery is to take place."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveryTo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryTo";
			definition = "Address is the address to which delivery is to take place.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "DLVY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("HOME");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AddressTypeCode";
				definition = "Specifies the type of address.";
				code_lazy = () -> Arrays.asList(AddressTypeCode.mmResidential, AddressTypeCode.mmBusiness, AddressTypeCode.mmPostal, AddressTypeCode.mmPOBox, AddressTypeCode.mmMailTo, AddressTypeCode.mmDeliveryTo);
				derivation_lazy = () -> Arrays.asList(AddressType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
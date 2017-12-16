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
import com.tools20022.repository.codeset.AttendanceContextCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Human attendance at the POI location during the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#Attended
 * AttendanceContextCode.mmAttended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#SemiAttended
 * AttendanceContextCode.mmSemiAttended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#Unattended
 * AttendanceContextCode.mmUnattended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#AttendantDelivery
 * AttendanceContextCode.mmAttendantDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#CustomerDelivery
 * AttendanceContextCode.mmCustomerDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#CarrierDelivery
 * AttendanceContextCode.mmCarrierDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#FullServe
 * AttendanceContextCode.mmFullServe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#SelfServe
 * AttendanceContextCode.mmSelfServe}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
 * AttendanceContext1Code}</li>
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
 * <li>"ATTD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AttendanceContextCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Human attendance at the POI location during the transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AttendanceContextCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Attended payment, with an attendant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attended payment, with an attendant."</li>
	 * </ul>
	 */
	public static final AttendanceContextCode Attended = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Attended";
			definition = "Attended payment, with an attendant.";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject();
			codeName = "ATTD";
		}
	};
	/**
	 * Semi-attended, including self checkout. An attendant supervises several
	 * payment, and could be called to help the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SATT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAttended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder."
	 * </li>
	 * </ul>
	 */
	public static final AttendanceContextCode SemiAttended = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SemiAttended";
			definition = "Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject();
			codeName = "SATT";
		}
	};
	/**
	 * Unattended payment, no attendant present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UATT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unattended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unattended payment, no attendant present."</li>
	 * </ul>
	 */
	public static final AttendanceContextCode Unattended = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unattended";
			definition = "Unattended payment, no attendant present.";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject();
			codeName = "UATT";
		}
	};
	/**
	 * Delivery by an attendant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery by an attendant."</li>
	 * </ul>
	 */
	public static final AttendanceContextCode AttendantDelivery = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendantDelivery";
			definition = "Delivery by an attendant.";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject();
			codeName = "ATTL";
		}
	};
	/**
	 * Delivery by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery by the customer."</li>
	 * </ul>
	 */
	public static final AttendanceContextCode CustomerDelivery = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDelivery";
			definition = "Delivery by the customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Delivery by a carrier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarrierDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery by a carrier."</li>
	 * </ul>
	 */
	public static final AttendanceContextCode CarrierDelivery = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierDelivery";
			definition = "Delivery by a carrier.";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject();
			codeName = "CARR";
		}
	};
	/**
	 * Full service for fuel distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullServe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full service for fuel distribution."</li>
	 * </ul>
	 */
	public static final AttendanceContextCode FullServe = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullServe";
			definition = "Full service for fuel distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Self service for fuel distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode
	 * AttendanceContextCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfServe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Self service for fuel distribution."</li>
	 * </ul>
	 */
	public static final AttendanceContextCode SelfServe = new AttendanceContextCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfServe";
			definition = "Self service for fuel distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.AttendanceContextCode.mmObject();
			codeName = "SELF";
		}
	};
	final static private LinkedHashMap<String, AttendanceContextCode> codesByName = new LinkedHashMap<>();

	protected AttendanceContextCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ATTD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AttendanceContextCode";
				definition = "Human attendance at the POI location during the transaction.";
				derivation_lazy = () -> Arrays.asList(AttendanceContext1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AttendanceContextCode.Attended, com.tools20022.repository.codeset.AttendanceContextCode.SemiAttended,
						com.tools20022.repository.codeset.AttendanceContextCode.Unattended, com.tools20022.repository.codeset.AttendanceContextCode.AttendantDelivery,
						com.tools20022.repository.codeset.AttendanceContextCode.CustomerDelivery, com.tools20022.repository.codeset.AttendanceContextCode.CarrierDelivery, com.tools20022.repository.codeset.AttendanceContextCode.FullServe,
						com.tools20022.repository.codeset.AttendanceContextCode.SelfServe);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Attended.getCodeName().get(), Attended);
		codesByName.put(SemiAttended.getCodeName().get(), SemiAttended);
		codesByName.put(Unattended.getCodeName().get(), Unattended);
		codesByName.put(AttendantDelivery.getCodeName().get(), AttendantDelivery);
		codesByName.put(CustomerDelivery.getCodeName().get(), CustomerDelivery);
		codesByName.put(CarrierDelivery.getCodeName().get(), CarrierDelivery);
		codesByName.put(FullServe.getCodeName().get(), FullServe);
		codesByName.put(SelfServe.getCodeName().get(), SelfServe);
	}

	public static AttendanceContextCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AttendanceContextCode[] values() {
		AttendanceContextCode[] values = new AttendanceContextCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AttendanceContextCode> {
		@Override
		public AttendanceContextCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AttendanceContextCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
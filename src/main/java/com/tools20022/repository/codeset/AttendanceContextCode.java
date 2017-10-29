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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Human attendance at the POI location during the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#Attended
 * AttendanceContextCode.Attended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#SemiAttended
 * AttendanceContextCode.SemiAttended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#Unattended
 * AttendanceContextCode.Unattended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#AttendantDelivery
 * AttendanceContextCode.AttendantDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#CustomerDelivery
 * AttendanceContextCode.CustomerDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#CarrierDelivery
 * AttendanceContextCode.CarrierDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#FullServe
 * AttendanceContextCode.FullServe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AttendanceContextCode#SelfServe
 * AttendanceContextCode.SelfServe}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
public class AttendanceContextCode {

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
	public static final MMCode Attended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Attended";
			definition = "Attended payment, with an attendant.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
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
	public static final MMCode SemiAttended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SemiAttended";
			definition = "Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
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
	public static final MMCode Unattended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unattended";
			definition = "Unattended payment, no attendant present.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
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
	public static final MMCode AttendantDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendantDelivery";
			definition = "Delivery by an attendant.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
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
	public static final MMCode CustomerDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDelivery";
			definition = "Delivery by the customer.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
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
	public static final MMCode CarrierDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierDelivery";
			definition = "Delivery by a carrier.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
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
	public static final MMCode FullServe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullServe";
			definition = "Full service for fuel distribution.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
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
	public static final MMCode SelfServe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfServe";
			definition = "Self service for fuel distribution.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
			codeName = "SELF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ATTD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AttendanceContextCode";
				definition = "Human attendance at the POI location during the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AttendanceContextCode.Attended, com.tools20022.repository.codeset.AttendanceContextCode.SemiAttended,
						com.tools20022.repository.codeset.AttendanceContextCode.Unattended, com.tools20022.repository.codeset.AttendanceContextCode.AttendantDelivery,
						com.tools20022.repository.codeset.AttendanceContextCode.CustomerDelivery, com.tools20022.repository.codeset.AttendanceContextCode.CarrierDelivery, com.tools20022.repository.codeset.AttendanceContextCode.FullServe,
						com.tools20022.repository.codeset.AttendanceContextCode.SelfServe);
				derivation_lazy = () -> Arrays.asList(AttendanceContext1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
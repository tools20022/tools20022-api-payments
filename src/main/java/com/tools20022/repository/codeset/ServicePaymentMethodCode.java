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
 * Defines the method for the payment of the tax applied on the services.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode#BalanceCompensable
 * ServicePaymentMethodCode.BalanceCompensable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode#HardCharge
 * ServicePaymentMethodCode.HardCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode#PreviouslyCharged
 * ServicePaymentMethodCode.PreviouslyCharged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode#InvoicedSeparately
 * ServicePaymentMethodCode.InvoicedSeparately}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode#Waived
 * ServicePaymentMethodCode.Waived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode#Free
 * ServicePaymentMethodCode.Free}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
 * ServicePaymentMethod1Code}</li>
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
 * <li>"BCMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServicePaymentMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the method for the payment of the tax applied on the services."</li>
 * </ul>
 */
public class ServicePaymentMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Allows the bank to offset a service charge with interest earned on the
	 * deposit account balance. The actual charges arising from balance
	 * compensable services are always calculated and charged at month end. Used
	 * in the USA.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode
	 * ServicePaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceCompensable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows the bank to offset a service charge with interest earned on the deposit account balance. The actual charges arising from balance compensable services are always calculated and charged at month end.  Used in the USA."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BalanceCompensable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceCompensable";
			definition = "Allows the bank to offset a service charge with interest earned on the deposit account balance. The actual charges arising from balance compensable services are always calculated and charged at month end.  Used in the USA.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "BCMP";
		}
	};
	/**
	 * Charge is not balance compensable and is due. In the absence of balance
	 * compensable charges in Europe, this would be the most commonly used code
	 * for services that are billed at month end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode
	 * ServicePaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HardCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge is not balance compensable and is due. In the absence of balance compensable charges in Europe, this would be the most commonly used code for services that are billed at month end."
	 * </li>
	 * </ul>
	 */
	public static final MMCode HardCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HardCharge";
			definition = "Charge is not balance compensable and is due. In the absence of balance compensable charges in Europe, this would be the most commonly used code for services that are billed at month end.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "FLAT";
		}
	};
	/**
	 * Charge was previously assessed and is not part of the amount due as of
	 * this statement. This code is used for charges that were debited as the
	 * chargeable event took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode
	 * ServicePaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PVCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyCharged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge was previously assessed and is not part of the amount due as of this statement. This code is used for charges that were debited as the chargeable event took place."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PreviouslyCharged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyCharged";
			definition = "Charge was previously assessed and is not part of the amount due as of this statement. This code is used for charges that were debited as the chargeable event took place.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "PVCH";
		}
	};
	/**
	 * Charge was previously invoiced and is not part of the amount due as of
	 * this statement. This code is used for charges that were invoiced as the
	 * chargeable event took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode
	 * ServicePaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoicedSeparately"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge was previously invoiced and is not part of the amount due as of this statement. This code is used for charges that were invoiced as the chargeable event took place."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InvoicedSeparately = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoicedSeparately";
			definition = "Charge was previously invoiced and is not part of the amount due as of this statement. This code is used for charges that were invoiced as the chargeable event took place.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "INVS";
		}
	};
	/**
	 * Charge is waived and not due. The waived amount must be placed in
	 * original charge amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode
	 * ServicePaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WVED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Waived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge is waived and not due. The waived amount must be placed in original charge amount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Waived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Waived";
			definition = "Charge is waived and not due. The waived amount must be placed in original charge amount.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "WVED";
		}
	};
	/**
	 * Service is free, no charge, to the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode
	 * ServicePaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Free"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service is free, no charge, to the customer."</li>
	 * </ul>
	 */
	public static final MMCode Free = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Free";
			definition = "Service is free, no charge, to the customer.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "FREE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BCMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ServicePaymentMethodCode";
				definition = "Defines the method for the payment of the tax applied on the services.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ServicePaymentMethodCode.BalanceCompensable, com.tools20022.repository.codeset.ServicePaymentMethodCode.HardCharge,
						com.tools20022.repository.codeset.ServicePaymentMethodCode.PreviouslyCharged, com.tools20022.repository.codeset.ServicePaymentMethodCode.InvoicedSeparately,
						com.tools20022.repository.codeset.ServicePaymentMethodCode.Waived, com.tools20022.repository.codeset.ServicePaymentMethodCode.Free);
				derivation_lazy = () -> Arrays.asList(ServicePaymentMethod1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
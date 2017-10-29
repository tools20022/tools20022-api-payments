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
import com.tools20022.repository.codeset.ChequeDeliveryCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method to be used in delivering a cheque to a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
 * ChequeDeliveryCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#MailToDebtor
 * ChequeDelivery1Code.MailToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#MailToCreditor
 * ChequeDelivery1Code.MailToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#MailToFinalAgent
 * ChequeDelivery1Code.MailToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#CourierToDebtor
 * ChequeDelivery1Code.CourierToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#CourierToCreditor
 * ChequeDelivery1Code.CourierToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#CourierToFinalAgent
 * ChequeDelivery1Code.CourierToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#PickUpByDebtor
 * ChequeDelivery1Code.PickUpByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#PickUpByCreditor
 * ChequeDelivery1Code.PickUpByCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#PickUpByFinalAgent
 * ChequeDelivery1Code.PickUpByFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#RegisteredMailToDebtor
 * ChequeDelivery1Code.RegisteredMailToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#RegisteredMailToCreditor
 * ChequeDelivery1Code.RegisteredMailToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code#RegisteredMailToFinalAgent
 * ChequeDelivery1Code.RegisteredMailToFinalAgent}</li>
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
 * <li>"MLDB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChequeDelivery1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method to be used in delivering a cheque to a party."</li>
 * </ul>
 */
public class ChequeDelivery1Code extends ChequeDeliveryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToDebtor"</li>
	 * </ul>
	 */
	public static final MMCode MailToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToDebtor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToCreditor"</li>
	 * </ul>
	 */
	public static final MMCode MailToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToCreditor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToFinalAgent"</li>
	 * </ul>
	 */
	public static final MMCode MailToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToFinalAgent";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToDebtor"</li>
	 * </ul>
	 */
	public static final MMCode CourierToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToDebtor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToCreditor"</li>
	 * </ul>
	 */
	public static final MMCode CourierToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToCreditor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToFinalAgent"</li>
	 * </ul>
	 */
	public static final MMCode CourierToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToFinalAgent";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByDebtor"</li>
	 * </ul>
	 */
	public static final MMCode PickUpByDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByDebtor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByCreditor"</li>
	 * </ul>
	 */
	public static final MMCode PickUpByCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByCreditor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByFinalAgent"</li>
	 * </ul>
	 */
	public static final MMCode PickUpByFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByFinalAgent";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToDebtor"</li>
	 * </ul>
	 */
	public static final MMCode RegisteredMailToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToDebtor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToCreditor"</li>
	 * </ul>
	 */
	public static final MMCode RegisteredMailToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToCreditor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
	 * ChequeDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToFinalAgent"</li>
	 * </ul>
	 */
	public static final MMCode RegisteredMailToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToFinalAgent";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MLDB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChequeDelivery1Code";
				definition = "Specifies the method to be used in delivering a cheque to a party.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeDelivery1Code.MailToDebtor, com.tools20022.repository.codeset.ChequeDelivery1Code.MailToCreditor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.MailToFinalAgent, com.tools20022.repository.codeset.ChequeDelivery1Code.CourierToDebtor, com.tools20022.repository.codeset.ChequeDelivery1Code.CourierToCreditor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.CourierToFinalAgent, com.tools20022.repository.codeset.ChequeDelivery1Code.PickUpByDebtor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.PickUpByCreditor, com.tools20022.repository.codeset.ChequeDelivery1Code.PickUpByFinalAgent,
						com.tools20022.repository.codeset.ChequeDelivery1Code.RegisteredMailToDebtor, com.tools20022.repository.codeset.ChequeDelivery1Code.RegisteredMailToCreditor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.RegisteredMailToFinalAgent);
				trace_lazy = () -> ChequeDeliveryCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
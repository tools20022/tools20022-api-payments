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
 * Specifies the method to be used in delivering a cheque to a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmMailToDebtor
 * ChequeDeliveryCode.mmMailToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmMailToCreditor
 * ChequeDeliveryCode.mmMailToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmMailToFinalAgent
 * ChequeDeliveryCode.mmMailToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmCourierToDebtor
 * ChequeDeliveryCode.mmCourierToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmCourierToCreditor
 * ChequeDeliveryCode.mmCourierToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmCourierToFinalAgent
 * ChequeDeliveryCode.mmCourierToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmPickUpByDebtor
 * ChequeDeliveryCode.mmPickUpByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmPickUpByCreditor
 * ChequeDeliveryCode.mmPickUpByCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmPickUpByFinalAgent
 * ChequeDeliveryCode.mmPickUpByFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmRegisteredMailToDebtor
 * ChequeDeliveryCode.mmRegisteredMailToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmRegisteredMailToCreditor
 * ChequeDeliveryCode.mmRegisteredMailToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#mmRegisteredMailToFinalAgent
 * ChequeDeliveryCode.mmRegisteredMailToFinalAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ChequeDelivery1Code
 * ChequeDelivery1Code}</li>
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
 * <li>"MLDB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChequeDeliveryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method to be used in delivering a cheque to a party."</li>
 * </ul>
 */
public class ChequeDeliveryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cheque is to be sent through mail services to debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheque is to be sent through mail services to debtor."</li>
	 * </ul>
	 */
	public static final MMCode mmMailToDebtor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailToDebtor";
			definition = "Cheque is to be sent through mail services to debtor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "MLDB";
		}
	};
	/**
	 * Cheque is to be sent through mail services to creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheque is to be sent through mail services to creditor."</li>
	 * </ul>
	 */
	public static final MMCode mmMailToCreditor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailToCreditor";
			definition = "Cheque is to be sent through mail services to creditor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "MLCD";
		}
	};
	/**
	 * Cheque is to be sent through mail services to creditor agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToFinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque is to be sent through mail services to creditor agent."</li>
	 * </ul>
	 */
	public static final MMCode mmMailToFinalAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MailToFinalAgent";
			definition = "Cheque is to be sent through mail services to creditor agent.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "MLFA";
		}
	};
	/**
	 * Cheque is to be sent through courier services to debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheque is to be sent through courier services to debtor."</li>
	 * </ul>
	 */
	public static final MMCode mmCourierToDebtor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CourierToDebtor";
			definition = "Cheque is to be sent through courier services to debtor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "CRDB";
		}
	};
	/**
	 * Cheque is to be sent through courier services to creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque is to be sent through courier services to creditor."</li>
	 * </ul>
	 */
	public static final MMCode mmCourierToCreditor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CourierToCreditor";
			definition = "Cheque is to be sent through courier services to creditor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "CRCD";
		}
	};
	/**
	 * Cheque is to be sent through courier services to creditor agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToFinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque is to be sent through courier services to creditor agent."</li>
	 * </ul>
	 */
	public static final MMCode mmCourierToFinalAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CourierToFinalAgent";
			definition = "Cheque is to be sent through courier services to creditor agent.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "CRFA";
		}
	};
	/**
	 * Cheque will be picked up by the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheque will be picked up by the debtor."</li>
	 * </ul>
	 */
	public static final MMCode mmPickUpByDebtor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PickUpByDebtor";
			definition = "Cheque will be picked up by the debtor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "PUDB";
		}
	};
	/**
	 * Cheque will be picked up by the creditor
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheque will be picked up by the creditor"</li>
	 * </ul>
	 */
	public static final MMCode mmPickUpByCreditor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PickUpByCreditor";
			definition = "Cheque will be picked up by the creditor";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "PUCD";
		}
	};
	/**
	 * Cheque will be picked up by the creditor agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByFinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheque will be picked up by the creditor agent."</li>
	 * </ul>
	 */
	public static final MMCode mmPickUpByFinalAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PickUpByFinalAgent";
			definition = "Cheque will be picked up by the creditor agent.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "PUFA";
		}
	};
	/**
	 * Cheque is to be sent through registered mail services to debtor
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RGDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque is to be sent through registered mail services to debtor"</li>
	 * </ul>
	 */
	public static final MMCode mmRegisteredMailToDebtor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredMailToDebtor";
			definition = "Cheque is to be sent through registered mail services to debtor";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "RGDB";
		}
	};
	/**
	 * Cheque is to be sent through registered mail services to creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RGCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque is to be sent through registered mail services to creditor."</li>
	 * </ul>
	 */
	public static final MMCode mmRegisteredMailToCreditor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredMailToCreditor";
			definition = "Cheque is to be sent through registered mail services to creditor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "RGCD";
		}
	};
	/**
	 * Cheque is to be sent through registered mail services to creditor agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
	 * ChequeDeliveryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RGFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToFinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cheque is to be sent through registered mail services to creditor agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRegisteredMailToFinalAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredMailToFinalAgent";
			definition = "Cheque is to be sent through registered mail services to creditor agent.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "RGFA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MLDB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChequeDeliveryCode";
				definition = "Specifies the method to be used in delivering a cheque to a party.";
				code_lazy = () -> Arrays.asList(ChequeDeliveryCode.mmMailToDebtor, ChequeDeliveryCode.mmMailToCreditor, ChequeDeliveryCode.mmMailToFinalAgent, ChequeDeliveryCode.mmCourierToDebtor, ChequeDeliveryCode.mmCourierToCreditor,
						ChequeDeliveryCode.mmCourierToFinalAgent, ChequeDeliveryCode.mmPickUpByDebtor, ChequeDeliveryCode.mmPickUpByCreditor, ChequeDeliveryCode.mmPickUpByFinalAgent, ChequeDeliveryCode.mmRegisteredMailToDebtor,
						ChequeDeliveryCode.mmRegisteredMailToCreditor, ChequeDeliveryCode.mmRegisteredMailToFinalAgent);
				derivation_lazy = () -> Arrays.asList(ChequeDelivery1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
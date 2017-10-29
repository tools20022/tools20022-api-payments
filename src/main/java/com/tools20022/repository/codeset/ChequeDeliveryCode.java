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
 * Specifies the method to be used in delivering a cheque to a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#MailToDebtor
 * ChequeDeliveryCode.MailToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#MailToCreditor
 * ChequeDeliveryCode.MailToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#MailToFinalAgent
 * ChequeDeliveryCode.MailToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#CourierToDebtor
 * ChequeDeliveryCode.CourierToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#CourierToCreditor
 * ChequeDeliveryCode.CourierToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#CourierToFinalAgent
 * ChequeDeliveryCode.CourierToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#PickUpByDebtor
 * ChequeDeliveryCode.PickUpByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#PickUpByCreditor
 * ChequeDeliveryCode.PickUpByCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#PickUpByFinalAgent
 * ChequeDeliveryCode.PickUpByFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#RegisteredMailToDebtor
 * ChequeDeliveryCode.RegisteredMailToDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#RegisteredMailToCreditor
 * ChequeDeliveryCode.RegisteredMailToCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode#RegisteredMailToFinalAgent
 * ChequeDeliveryCode.RegisteredMailToFinalAgent}</li>
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
	public static final MMCode MailToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode MailToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode MailToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CourierToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CourierToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode CourierToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode PickUpByDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode PickUpByCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode PickUpByFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode RegisteredMailToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode RegisteredMailToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode RegisteredMailToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredMailToFinalAgent";
			definition = "Cheque is to be sent through registered mail services to creditor agent.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "RGFA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MLDB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChequeDeliveryCode";
				definition = "Specifies the method to be used in delivering a cheque to a party.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeDeliveryCode.MailToDebtor, com.tools20022.repository.codeset.ChequeDeliveryCode.MailToCreditor,
						com.tools20022.repository.codeset.ChequeDeliveryCode.MailToFinalAgent, com.tools20022.repository.codeset.ChequeDeliveryCode.CourierToDebtor, com.tools20022.repository.codeset.ChequeDeliveryCode.CourierToCreditor,
						com.tools20022.repository.codeset.ChequeDeliveryCode.CourierToFinalAgent, com.tools20022.repository.codeset.ChequeDeliveryCode.PickUpByDebtor, com.tools20022.repository.codeset.ChequeDeliveryCode.PickUpByCreditor,
						com.tools20022.repository.codeset.ChequeDeliveryCode.PickUpByFinalAgent, com.tools20022.repository.codeset.ChequeDeliveryCode.RegisteredMailToDebtor,
						com.tools20022.repository.codeset.ChequeDeliveryCode.RegisteredMailToCreditor, com.tools20022.repository.codeset.ChequeDeliveryCode.RegisteredMailToFinalAgent);
				derivation_lazy = () -> Arrays.asList(ChequeDelivery1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
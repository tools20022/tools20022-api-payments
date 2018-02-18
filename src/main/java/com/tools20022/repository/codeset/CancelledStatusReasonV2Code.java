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
import com.tools20022.repository.codeset.CancelledStatusReasonV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * See narrative field for reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByYourself
 * CancelledStatusReasonV2Code.CancelledByYourself}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledBySystem
 * CancelledStatusReasonV2Code.CancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByAgent
 * CancelledStatusReasonV2Code.CancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByHub
 * CancelledStatusReasonV2Code.CancelledByHub}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByInstructingParty
 * CancelledStatusReasonV2Code.CancelledByInstructingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#EndOfLife
 * CancelledStatusReasonV2Code.EndOfLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByOther
 * CancelledStatusReasonV2Code.CancelledByOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByTransferAgent
 * CancelledStatusReasonV2Code.CancelledByTransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByClient
 * CancelledStatusReasonV2Code.CancelledByClient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByIntermediary
 * CancelledStatusReasonV2Code.CancelledByIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledDueToTransformation
 * CancelledStatusReasonV2Code.CancelledDueToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledSplitPartialSettlement
 * CancelledStatusReasonV2Code.CancelledSplitPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledDueToCorporateAction
 * CancelledStatusReasonV2Code.CancelledDueToCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByIssuerRegistrar
 * CancelledStatusReasonV2Code.CancelledByIssuerRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#SecuritiesNoLongerEligible
 * CancelledStatusReasonV2Code.SecuritiesNoLongerEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#NarrativeReason
 * CancelledStatusReasonV2Code.NarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#Other
 * CancelledStatusReasonV2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#CancelledByThirdParty
 * CancelledStatusReasonV2Code.CancelledByThirdParty}</li>
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
 * <li>"CANI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancelledStatusReasonV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "See narrative field for reason."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancelledStatusReasonV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is cancelled by yourself.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByYourself"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by yourself."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByYourself = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByYourself";
			definition = "Transaction is cancelled by yourself.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CANI";
		}
	};
	/**
	 * Transaction is cancelled by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the system."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledBySystem = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledBySystem";
			definition = "Transaction is cancelled by the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CANS";
		}
	};
	/**
	 * Instruction has been cancelled by the agent due to an event deadline
	 * extension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSUB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been cancelled by the agent due to an event deadline extension."
	 * </li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByAgent = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByAgent";
			definition = "Instruction has been cancelled by the agent due to an event deadline extension.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CSUB";
		}
	};
	/**
	 * Transaction is cancelled by the hub.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByHub"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the hub."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByHub = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByHub";
			definition = "Transaction is cancelled by the hub.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CANH";
		}
	};
	/**
	 * Transaction is cancelled by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByInstructingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the instructing party."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByInstructingParty = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByInstructingParty";
			definition = "Transaction is cancelled by the instructing party.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Transaction is rejected by the executing party, the rejection is final
	 * therefore the order is cancelled in the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CXLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfLife"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system."
	 * </li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code EndOfLife = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndOfLife";
			definition = "Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CXLR";
		}
	};
	/**
	 * Transaction is cancelled by a party other than the instructing party, for
	 * example, a market infrastructure such as a stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByOther"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is cancelled by a party other than the instructing party, for example, a market infrastructure such as a stock exchange."
	 * </li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByOther = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByOther";
			definition = "Transaction is cancelled by a party other than the instructing party, for example, a market infrastructure such as a stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CANO";
		}
	};
	/**
	 * Transaction is cancelled by the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByTransferAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the transfer agent."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByTransferAgent = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByTransferAgent";
			definition = "Transaction is cancelled by the transfer agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CNTA";
		}
	};
	/**
	 * Transaction is cancelled by the client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByClient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the client."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByClient = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByClient";
			definition = "Transaction is cancelled by the client.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Transaction is cancelled by the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is cancelled by the intermediary."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByIntermediary = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByIntermediary";
			definition = "Transaction is cancelled by the intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CNIN";
		}
	};
	/**
	 * Original transaction has been cancelled and replaced due to a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToTransformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original transaction has been cancelled and replaced due to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledDueToTransformation = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledDueToTransformation";
			definition = "Original transaction has been cancelled and replaced due to a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CANT";
		}
	};
	/**
	 * Original transaction has been cancelled and replaced to allow a partial
	 * or split settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledSplitPartialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original transaction has been cancelled and replaced to allow a partial or split settlement."
	 * </li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledSplitPartialSettlement = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledSplitPartialSettlement";
			definition = "Original transaction has been cancelled and replaced to allow a partial or split settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CANZ";
		}
	};
	/**
	 * Transaction has been cancelled due to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been cancelled due to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledDueToCorporateAction = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledDueToCorporateAction";
			definition = "Transaction has been cancelled due to a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Transaction has been cancelled by the issuer/registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByIssuerRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been cancelled by the issuer/registrar."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByIssuerRegistrar = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByIssuerRegistrar";
			definition = "Transaction has been cancelled by the issuer/registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CREG";
		}
	};
	/**
	 * Transaction has been cancelled; the security no longer exists or is no
	 * longer eligible on the market instructed. For corporate action related
	 * cancellation, CORP should be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesNoLongerEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been cancelled; the security no longer exists or is no longer eligible on the market instructed. For corporate action related cancellation, CORP should be used."
	 * </li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code SecuritiesNoLongerEligible = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesNoLongerEligible";
			definition = "Transaction has been cancelled; the security no longer exists or is no longer eligible on the market instructed. For corporate action related cancellation, CORP should be used.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "SCEX";
		}
	};
	/**
	 * See narrative field for reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "See narrative field for reason."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code NarrativeReason = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code Other = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Instruction is cancelled by a Third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
	 * CancelledStatusReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTHP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByThirdParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is cancelled by a Third party."</li>
	 * </ul>
	 */
	public static final CancelledStatusReasonV2Code CancelledByThirdParty = new CancelledStatusReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByThirdParty";
			definition = "Instruction is cancelled by a Third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReasonV2Code.mmObject();
			codeName = "CTHP";
		}
	};
	final static private LinkedHashMap<String, CancelledStatusReasonV2Code> codesByName = new LinkedHashMap<>();

	protected CancelledStatusReasonV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReasonV2Code";
				definition = "See narrative field for reason.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByYourself, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledBySystem,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByAgent, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByHub,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByInstructingParty, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.EndOfLife,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByOther, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByTransferAgent,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByClient, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByIntermediary,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledDueToTransformation, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledSplitPartialSettlement,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledDueToCorporateAction, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByIssuerRegistrar,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.SecuritiesNoLongerEligible, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.NarrativeReason,
						com.tools20022.repository.codeset.CancelledStatusReasonV2Code.Other, com.tools20022.repository.codeset.CancelledStatusReasonV2Code.CancelledByThirdParty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledByYourself.getCodeName().get(), CancelledByYourself);
		codesByName.put(CancelledBySystem.getCodeName().get(), CancelledBySystem);
		codesByName.put(CancelledByAgent.getCodeName().get(), CancelledByAgent);
		codesByName.put(CancelledByHub.getCodeName().get(), CancelledByHub);
		codesByName.put(CancelledByInstructingParty.getCodeName().get(), CancelledByInstructingParty);
		codesByName.put(EndOfLife.getCodeName().get(), EndOfLife);
		codesByName.put(CancelledByOther.getCodeName().get(), CancelledByOther);
		codesByName.put(CancelledByTransferAgent.getCodeName().get(), CancelledByTransferAgent);
		codesByName.put(CancelledByClient.getCodeName().get(), CancelledByClient);
		codesByName.put(CancelledByIntermediary.getCodeName().get(), CancelledByIntermediary);
		codesByName.put(CancelledDueToTransformation.getCodeName().get(), CancelledDueToTransformation);
		codesByName.put(CancelledSplitPartialSettlement.getCodeName().get(), CancelledSplitPartialSettlement);
		codesByName.put(CancelledDueToCorporateAction.getCodeName().get(), CancelledDueToCorporateAction);
		codesByName.put(CancelledByIssuerRegistrar.getCodeName().get(), CancelledByIssuerRegistrar);
		codesByName.put(SecuritiesNoLongerEligible.getCodeName().get(), SecuritiesNoLongerEligible);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(CancelledByThirdParty.getCodeName().get(), CancelledByThirdParty);
	}

	public static CancelledStatusReasonV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancelledStatusReasonV2Code[] values() {
		CancelledStatusReasonV2Code[] values = new CancelledStatusReasonV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancelledStatusReasonV2Code> {
		@Override
		public CancelledStatusReasonV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancelledStatusReasonV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
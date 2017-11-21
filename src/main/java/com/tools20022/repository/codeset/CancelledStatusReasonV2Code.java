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
 * See narrative field for reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByYourself
 * CancelledStatusReasonV2Code.mmCancelledByYourself}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledBySystem
 * CancelledStatusReasonV2Code.mmCancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByAgent
 * CancelledStatusReasonV2Code.mmCancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByHub
 * CancelledStatusReasonV2Code.mmCancelledByHub}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByInstructingParty
 * CancelledStatusReasonV2Code.mmCancelledByInstructingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmEndOfLife
 * CancelledStatusReasonV2Code.mmEndOfLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByOther
 * CancelledStatusReasonV2Code.mmCancelledByOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByTransferAgent
 * CancelledStatusReasonV2Code.mmCancelledByTransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByClient
 * CancelledStatusReasonV2Code.mmCancelledByClient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByIntermediary
 * CancelledStatusReasonV2Code.mmCancelledByIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledDueToTransformation
 * CancelledStatusReasonV2Code.mmCancelledDueToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledSplitPartialSettlement
 * CancelledStatusReasonV2Code.mmCancelledSplitPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledDueToCorporateAction
 * CancelledStatusReasonV2Code.mmCancelledDueToCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByIssuerRegistrar
 * CancelledStatusReasonV2Code.mmCancelledByIssuerRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmSecuritiesNoLongerEligible
 * CancelledStatusReasonV2Code.mmSecuritiesNoLongerEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmNarrativeReason
 * CancelledStatusReasonV2Code.mmNarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmOther
 * CancelledStatusReasonV2Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code#mmCancelledByThirdParty
 * CancelledStatusReasonV2Code.mmCancelledByThirdParty}</li>
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
public class CancelledStatusReasonV2Code {

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
	public static final MMCode mmCancelledByYourself = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByYourself";
			definition = "Transaction is cancelled by yourself.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledBySystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledBySystem";
			definition = "Transaction is cancelled by the system.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledByAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByAgent";
			definition = "Instruction has been cancelled by the agent due to an event deadline extension.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledByHub = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByHub";
			definition = "Transaction is cancelled by the hub.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledByInstructingParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByInstructingParty";
			definition = "Transaction is cancelled by the instructing party.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmEndOfLife = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndOfLife";
			definition = "Transaction is rejected by the executing party, the rejection is final therefore the order is cancelled in the system.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledByOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByOther";
			definition = "Transaction is cancelled by a party other than the instructing party, for example, a market infrastructure such as a stock exchange.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledByTransferAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByTransferAgent";
			definition = "Transaction is cancelled by the transfer agent.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledByClient = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByClient";
			definition = "Transaction is cancelled by the client.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledByIntermediary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByIntermediary";
			definition = "Transaction is cancelled by the intermediary.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledDueToTransformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledDueToTransformation";
			definition = "Original transaction has been cancelled and replaced due to a corporate action.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledSplitPartialSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledSplitPartialSettlement";
			definition = "Original transaction has been cancelled and replaced to allow a partial or split settlement.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledDueToCorporateAction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledDueToCorporateAction";
			definition = "Transaction has been cancelled due to a corporate action.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledByIssuerRegistrar = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelledByIssuerRegistrar";
			definition = "Transaction has been cancelled by the issuer/registrar.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmSecuritiesNoLongerEligible = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesNoLongerEligible";
			definition = "Transaction has been cancelled; the security no longer exists or is no longer eligible on the market instructed. For corporate action related cancellation, CORP should be used.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmNarrativeReason = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for reason.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
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
	public static final MMCode mmCancelledByThirdParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByThirdParty";
			definition = "Instruction is cancelled by a Third party.";
			owner_lazy = () -> CancelledStatusReasonV2Code.mmObject();
			codeName = "CTHP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CANI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReasonV2Code";
				definition = "See narrative field for reason.";
				code_lazy = () -> Arrays.asList(CancelledStatusReasonV2Code.mmCancelledByYourself, CancelledStatusReasonV2Code.mmCancelledBySystem, CancelledStatusReasonV2Code.mmCancelledByAgent,
						CancelledStatusReasonV2Code.mmCancelledByHub, CancelledStatusReasonV2Code.mmCancelledByInstructingParty, CancelledStatusReasonV2Code.mmEndOfLife, CancelledStatusReasonV2Code.mmCancelledByOther,
						CancelledStatusReasonV2Code.mmCancelledByTransferAgent, CancelledStatusReasonV2Code.mmCancelledByClient, CancelledStatusReasonV2Code.mmCancelledByIntermediary,
						CancelledStatusReasonV2Code.mmCancelledDueToTransformation, CancelledStatusReasonV2Code.mmCancelledSplitPartialSettlement, CancelledStatusReasonV2Code.mmCancelledDueToCorporateAction,
						CancelledStatusReasonV2Code.mmCancelledByIssuerRegistrar, CancelledStatusReasonV2Code.mmSecuritiesNoLongerEligible, CancelledStatusReasonV2Code.mmNarrativeReason, CancelledStatusReasonV2Code.mmOther,
						CancelledStatusReasonV2Code.mmCancelledByThirdParty);
			}
		});
		return mmObject_lazy.get();
	}
}
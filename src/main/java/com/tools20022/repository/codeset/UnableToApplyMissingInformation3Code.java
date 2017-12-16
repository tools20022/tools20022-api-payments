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
import com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of an unable to apply due to missing information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingRemittanceInformation
 * UnableToApplyMissingInformation3Code.mmMissingRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingInstructionForNextAgent
 * UnableToApplyMissingInformation3Code.mmMissingInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingDebtor
 * UnableToApplyMissingInformation3Code.mmMissingDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingDebtorAccount
 * UnableToApplyMissingInformation3Code.mmMissingDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingDebtorAgent
 * UnableToApplyMissingInformation3Code.mmMissingDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingAmount
 * UnableToApplyMissingInformation3Code.mmMissingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingSettlementAccount
 * UnableToApplyMissingInformation3Code.mmMissingSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingIntermediary
 * UnableToApplyMissingInformation3Code.mmMissingIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingInstructingReimbursementAgent
 * UnableToApplyMissingInformation3Code.mmMissingInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingInstructedReimbursementAgent
 * UnableToApplyMissingInformation3Code.mmMissingInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingThirdReimbursementAgent
 * UnableToApplyMissingInformation3Code.mmMissingThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingCreditor
 * UnableToApplyMissingInformation3Code.mmMissingCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingCreditorAccount
 * UnableToApplyMissingInformation3Code.mmMissingCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingInstruction
 * UnableToApplyMissingInformation3Code.mmMissingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingCreditorAgent
 * UnableToApplyMissingInformation3Code.mmMissingCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingInstructionForCreditorAgent
 * UnableToApplyMissingInformation3Code.mmMissingInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#MissingInstructionForDebtorAgent
 * UnableToApplyMissingInformation3Code.mmMissingInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code#Narrative
 * UnableToApplyMissingInformation3Code.mmNarrative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
 * UnableToApplyMissingInformationV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MS01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyMissingInformation3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of an unable to apply due to missing information."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnableToApplyMissingInformation3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingRemittanceInformation"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingRemittanceInformation = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingRemittanceInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingRemittanceInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructionForNextAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingInstructionForNextAgent = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructionForNextAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructionForNextAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtor"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingDebtor = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtorAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingDebtorAccount = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDebtorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingDebtorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtorAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingDebtorAgent = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDebtorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingDebtorAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingAmount"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingAmount = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingSettlementAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingSettlementAccount = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingSettlementAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingSettlementAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingIntermediary"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingIntermediary = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingIntermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingIntermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructingReimbursementAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingInstructingReimbursementAgent = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructingReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructingReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructedReimbursementAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingInstructedReimbursementAgent = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructedReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructedReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingThirdReimbursementAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingThirdReimbursementAgent = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingThirdReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingThirdReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditor"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingCreditor = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditorAccount"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingCreditorAccount = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingCreditorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstruction"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingInstruction = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditorAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingCreditorAgent = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingCreditorAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructionForCreditorAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingInstructionForCreditorAgent = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructionForCreditorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructionForCreditorAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructionForDebtorAgent"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code MissingInstructionForDebtorAgent = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructionForDebtorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructionForDebtorAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code
	 * UnableToApplyMissingInformation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation3Code Narrative = new UnableToApplyMissingInformation3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.Narrative.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnableToApplyMissingInformation3Code> codesByName = new LinkedHashMap<>();

	protected UnableToApplyMissingInformation3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MS01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyMissingInformation3Code";
				definition = "Specifies the reason of an unable to apply due to missing information.";
				trace_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingRemittanceInformation,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingInstructionForNextAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingDebtor,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingDebtorAccount, com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingDebtorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingAmount, com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingSettlementAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingIntermediary, com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingInstructingReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingInstructedReimbursementAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingThirdReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingCreditor, com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingCreditorAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingInstruction, com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingCreditorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingInstructionForCreditorAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.MissingInstructionForDebtorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation3Code.Narrative);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MissingRemittanceInformation.getCodeName().get(), MissingRemittanceInformation);
		codesByName.put(MissingInstructionForNextAgent.getCodeName().get(), MissingInstructionForNextAgent);
		codesByName.put(MissingDebtor.getCodeName().get(), MissingDebtor);
		codesByName.put(MissingDebtorAccount.getCodeName().get(), MissingDebtorAccount);
		codesByName.put(MissingDebtorAgent.getCodeName().get(), MissingDebtorAgent);
		codesByName.put(MissingAmount.getCodeName().get(), MissingAmount);
		codesByName.put(MissingSettlementAccount.getCodeName().get(), MissingSettlementAccount);
		codesByName.put(MissingIntermediary.getCodeName().get(), MissingIntermediary);
		codesByName.put(MissingInstructingReimbursementAgent.getCodeName().get(), MissingInstructingReimbursementAgent);
		codesByName.put(MissingInstructedReimbursementAgent.getCodeName().get(), MissingInstructedReimbursementAgent);
		codesByName.put(MissingThirdReimbursementAgent.getCodeName().get(), MissingThirdReimbursementAgent);
		codesByName.put(MissingCreditor.getCodeName().get(), MissingCreditor);
		codesByName.put(MissingCreditorAccount.getCodeName().get(), MissingCreditorAccount);
		codesByName.put(MissingInstruction.getCodeName().get(), MissingInstruction);
		codesByName.put(MissingCreditorAgent.getCodeName().get(), MissingCreditorAgent);
		codesByName.put(MissingInstructionForCreditorAgent.getCodeName().get(), MissingInstructionForCreditorAgent);
		codesByName.put(MissingInstructionForDebtorAgent.getCodeName().get(), MissingInstructionForDebtorAgent);
		codesByName.put(Narrative.getCodeName().get(), Narrative);
	}

	public static UnableToApplyMissingInformation3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnableToApplyMissingInformation3Code[] values() {
		UnableToApplyMissingInformation3Code[] values = new UnableToApplyMissingInformation3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnableToApplyMissingInformation3Code> {
		@Override
		public UnableToApplyMissingInformation3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnableToApplyMissingInformation3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
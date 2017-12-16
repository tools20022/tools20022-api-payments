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
import com.tools20022.repository.codeset.AcknowledgementReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies additional information about the processed instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#AccountServicerDeadlineMissed
 * AcknowledgementReasonCode.mmAccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#MarketPracticeRuleDiscrepency
 * AcknowledgementReasonCode.mmMarketPracticeRuleDiscrepency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#MarketDeadlineMissed
 * AcknowledgementReasonCode.mmMarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#NotStraightThroughProcessing
 * AcknowledgementReasonCode.mmNotStraightThroughProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#AcceptedWithoutVotingRights
 * AcknowledgementReasonCode.mmAcceptedWithoutVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#Other
 * AcknowledgementReasonCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#ConditionalCurrency
 * AcknowledgementReasonCode.mmConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#ConditionalRegistrar
 * AcknowledgementReasonCode.mmConditionalRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#ConditionalRealignement
 * AcknowledgementReasonCode.mmConditionalRealignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode#NarrativeReason
 * AcknowledgementReasonCode.mmNarrativeReason}</li>
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
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcknowledgementReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional information about the processed instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AcknowledgementReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Received after the account servicer's deadline. Processed on best effort
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Received after the account servicer's deadline. Processed on best effort basis."
	 * </li>
	 * </ul>
	 */
	public static final AcknowledgementReasonCode AccountServicerDeadlineMissed = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Received after the account servicer's deadline. Processed on best effort basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Instruction is accepted but does not comply with the market practice rule
	 * published for the concerned market or process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeRuleDiscrepency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is accepted but does not comply with the market practice rule published for the concerned market or process."
	 * </li>
	 * </ul>
	 */
	public static final AcknowledgementReasonCode MarketPracticeRuleDiscrepency = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeRuleDiscrepency";
			definition = "Instruction is accepted but does not comply with the market practice rule published for the concerned market or process.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "SMPG";
		}
	};
	/**
	 * Instruction was received after market deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction was received after market deadline."</li>
	 * </ul>
	 */
	public static final AcknowledgementReasonCode MarketDeadlineMissed = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Instruction was received after market deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Instruction was not straight through processing and had to be processed
	 * manually.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotStraightThroughProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction was not straight through processing and had to be processed manually."
	 * </li>
	 * </ul>
	 */
	public static final AcknowledgementReasonCode NotStraightThroughProcessing = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotStraightThroughProcessing";
			definition = "Instruction was not straight through processing and had to be processed manually.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "NSTP";
		}
	};
	/**
	 * Instruction registration is accepted but the registration is not in full,
	 * that is, not with voting rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RQWV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedWithoutVotingRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction registration is accepted but the registration is not in full, that is, not with voting rights."
	 * </li>
	 * </ul>
	 */
	public static final AcknowledgementReasonCode AcceptedWithoutVotingRights = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedWithoutVotingRights";
			definition = "Instruction registration is accepted but the registration is not in full, that is, not with voting rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "RQWV";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
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
	public static final AcknowledgementReasonCode Other = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Execution is conditional to the execution of a process linked to the
	 * currency of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is conditional to the execution of a process linked to the currency of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final AcknowledgementReasonCode ConditionalCurrency = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			definition = "Execution is conditional to the execution of a process linked to the currency of the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "CDCY";
		}
	};
	/**
	 * Execution is conditional to the execution of a process at the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is conditional to the execution of a process at the registrar."
	 * </li>
	 * </ul>
	 */
	public static final AcknowledgementReasonCode ConditionalRegistrar = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			definition = "Execution is conditional to the execution of a process at the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "CDRG";
		}
	};
	/**
	 * Execution is conditional to the execution of a process of realignment at
	 * the issuer CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRealignement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Execution is conditional to the execution of a process of realignment at the issuer CSD."
	 * </li>
	 * </ul>
	 */
	public static final AcknowledgementReasonCode ConditionalRealignement = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			definition = "Execution is conditional to the execution of a process of realignment at the issuer CSD.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "CDRE";
		}
	};
	/**
	 * See narrative field for reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
	 * AcknowledgementReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "See narrative field for reason."</li>
	 * </ul>
	 */
	public static final AcknowledgementReasonCode NarrativeReason = new AcknowledgementReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReasonCode.mmObject();
			codeName = "NARR";
		}
	};
	final static private LinkedHashMap<String, AcknowledgementReasonCode> codesByName = new LinkedHashMap<>();

	protected AcknowledgementReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcknowledgementReasonCode";
				definition = "Specifies additional information about the processed instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AcknowledgementReasonCode.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.AcknowledgementReasonCode.MarketPracticeRuleDiscrepency,
						com.tools20022.repository.codeset.AcknowledgementReasonCode.MarketDeadlineMissed, com.tools20022.repository.codeset.AcknowledgementReasonCode.NotStraightThroughProcessing,
						com.tools20022.repository.codeset.AcknowledgementReasonCode.AcceptedWithoutVotingRights, com.tools20022.repository.codeset.AcknowledgementReasonCode.Other,
						com.tools20022.repository.codeset.AcknowledgementReasonCode.ConditionalCurrency, com.tools20022.repository.codeset.AcknowledgementReasonCode.ConditionalRegistrar,
						com.tools20022.repository.codeset.AcknowledgementReasonCode.ConditionalRealignement, com.tools20022.repository.codeset.AcknowledgementReasonCode.NarrativeReason);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(MarketPracticeRuleDiscrepency.getCodeName().get(), MarketPracticeRuleDiscrepency);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(NotStraightThroughProcessing.getCodeName().get(), NotStraightThroughProcessing);
		codesByName.put(AcceptedWithoutVotingRights.getCodeName().get(), AcceptedWithoutVotingRights);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ConditionalCurrency.getCodeName().get(), ConditionalCurrency);
		codesByName.put(ConditionalRegistrar.getCodeName().get(), ConditionalRegistrar);
		codesByName.put(ConditionalRealignement.getCodeName().get(), ConditionalRealignement);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
	}

	public static AcknowledgementReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AcknowledgementReasonCode[] values() {
		AcknowledgementReasonCode[] values = new AcknowledgementReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AcknowledgementReasonCode> {
		@Override
		public AcknowledgementReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AcknowledgementReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
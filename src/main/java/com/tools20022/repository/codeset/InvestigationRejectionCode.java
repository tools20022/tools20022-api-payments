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
import com.tools20022.repository.codeset.InvestigationRejectionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for rejecting an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode#UnderlyingPaymentNotFound
 * InvestigationRejectionCode.mmUnderlyingPaymentNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode#NotAuthorisedToInvestigate
 * InvestigationRejectionCode.mmNotAuthorisedToInvestigate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode#UnknownCase
 * InvestigationRejectionCode.mmUnknownCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode#PaymentPreviouslyCancelledOrRejected
 * InvestigationRejectionCode.mmPaymentPreviouslyCancelledOrRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode#WrongMessage
 * InvestigationRejectionCode.mmWrongMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode#RejectNonCashRelated
 * InvestigationRejectionCode.mmRejectNonCashRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode#MissingResolutionOfInvestigation
 * InvestigationRejectionCode.mmMissingResolutionOfInvestigation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code
 * InvestigationRejection1Code}</li>
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
 * <li>"NFND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestigationRejectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for rejecting an investigation case."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestigationRejectionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Underlying instruction can not be found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
	 * InvestigationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingPaymentNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying instruction can not be found."</li>
	 * </ul>
	 */
	public static final InvestigationRejectionCode UnderlyingPaymentNotFound = new InvestigationRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingPaymentNotFound";
			definition = "Underlying instruction can not be found.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejectionCode.mmObject();
			codeName = "NFND";
		}
	};
	/**
	 * Case assignee is not allowed to investigate on this instruction or a
	 * party has been by-passed in the payment chain or no bilateral agreement
	 * has been established for this type of query.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
	 * InvestigationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorisedToInvestigate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case assignee is not allowed to investigate on this instruction or a party has been by-passed in the payment chain or no bilateral agreement has been established for this type of query."
	 * </li>
	 * </ul>
	 */
	public static final InvestigationRejectionCode NotAuthorisedToInvestigate = new InvestigationRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorisedToInvestigate";
			definition = "Case assignee is not allowed to investigate on this instruction or a party has been by-passed in the payment chain or no bilateral agreement has been established for this type of query.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejectionCode.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * Case has never been assigned before.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
	 * InvestigationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKNW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case has never been assigned before."</li>
	 * </ul>
	 */
	public static final InvestigationRejectionCode UnknownCase = new InvestigationRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownCase";
			definition = "Case has never been assigned before.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejectionCode.mmObject();
			codeName = "UKNW";
		}
	};
	/**
	 * Used when the payment instruction has previously been cancelled or
	 * rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
	 * InvestigationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentPreviouslyCancelledOrRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when the payment instruction has previously been cancelled or rejected."
	 * </li>
	 * </ul>
	 */
	public static final InvestigationRejectionCode PaymentPreviouslyCancelledOrRejected = new InvestigationRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPreviouslyCancelledOrRejected";
			definition = "Used when the payment instruction has previously been cancelled or rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejectionCode.mmObject();
			codeName = "PCOR";
		}
	};
	/**
	 * Wrong message has been used in the investigation workflow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
	 * InvestigationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WMSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wrong message has been used in the investigation workflow."</li>
	 * </ul>
	 */
	public static final InvestigationRejectionCode WrongMessage = new InvestigationRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongMessage";
			definition = "Wrong message has been used in the investigation workflow.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejectionCode.mmObject();
			codeName = "WMSG";
		}
	};
	/**
	 * Used to reject a non-cash related query that is not covered in the
	 * workflow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
	 * InvestigationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RNCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectNonCashRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to reject a non-cash related query that is not covered in the workflow."
	 * </li>
	 * </ul>
	 */
	public static final InvestigationRejectionCode RejectNonCashRelated = new InvestigationRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectNonCashRelated";
			definition = "Used to reject a non-cash related query that is not covered in the workflow.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejectionCode.mmObject();
			codeName = "RNCR";
		}
	};
	/**
	 * Resolution of Investigation has not been received on reopened case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
	 * InvestigationRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MROI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingResolutionOfInvestigation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Resolution of Investigation has not been received on reopened case."</li>
	 * </ul>
	 */
	public static final InvestigationRejectionCode MissingResolutionOfInvestigation = new InvestigationRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingResolutionOfInvestigation";
			definition = "Resolution of Investigation has not been received on reopened case.";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejectionCode.mmObject();
			codeName = "MROI";
		}
	};
	final static private LinkedHashMap<String, InvestigationRejectionCode> codesByName = new LinkedHashMap<>();

	protected InvestigationRejectionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NFND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationRejectionCode";
				definition = "Specifies the reason for rejecting an investigation case.";
				derivation_lazy = () -> Arrays.asList(InvestigationRejection1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationRejectionCode.UnderlyingPaymentNotFound, com.tools20022.repository.codeset.InvestigationRejectionCode.NotAuthorisedToInvestigate,
						com.tools20022.repository.codeset.InvestigationRejectionCode.UnknownCase, com.tools20022.repository.codeset.InvestigationRejectionCode.PaymentPreviouslyCancelledOrRejected,
						com.tools20022.repository.codeset.InvestigationRejectionCode.WrongMessage, com.tools20022.repository.codeset.InvestigationRejectionCode.RejectNonCashRelated,
						com.tools20022.repository.codeset.InvestigationRejectionCode.MissingResolutionOfInvestigation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnderlyingPaymentNotFound.getCodeName().get(), UnderlyingPaymentNotFound);
		codesByName.put(NotAuthorisedToInvestigate.getCodeName().get(), NotAuthorisedToInvestigate);
		codesByName.put(UnknownCase.getCodeName().get(), UnknownCase);
		codesByName.put(PaymentPreviouslyCancelledOrRejected.getCodeName().get(), PaymentPreviouslyCancelledOrRejected);
		codesByName.put(WrongMessage.getCodeName().get(), WrongMessage);
		codesByName.put(RejectNonCashRelated.getCodeName().get(), RejectNonCashRelated);
		codesByName.put(MissingResolutionOfInvestigation.getCodeName().get(), MissingResolutionOfInvestigation);
	}

	public static InvestigationRejectionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestigationRejectionCode[] values() {
		InvestigationRejectionCode[] values = new InvestigationRejectionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestigationRejectionCode> {
		@Override
		public InvestigationRejectionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestigationRejectionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
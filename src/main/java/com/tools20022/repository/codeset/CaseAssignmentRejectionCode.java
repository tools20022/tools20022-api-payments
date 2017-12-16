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
import com.tools20022.repository.codeset.CaseAssignmentRejectionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for not accepting a Case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#UnderlyingPaymentNotFound
 * CaseAssignmentRejectionCode.mmUnderlyingPaymentNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#NotAuthorisedToInvestigate
 * CaseAssignmentRejectionCode.mmNotAuthorisedToInvestigate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#UnknownCase
 * CaseAssignmentRejectionCode.mmUnknownCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#PaymentRejected
 * CaseAssignmentRejectionCode.mmPaymentRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#PaymentCancelled
 * CaseAssignmentRejectionCode.mmPaymentCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode#PaymentPreviouslyCancelledOrRejected
 * CaseAssignmentRejectionCode.mmPaymentPreviouslyCancelledOrRejected}</li>
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
 * "CaseAssignmentRejectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for not accepting a Case."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CaseAssignmentRejectionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Underlying instruction can not be found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingPaymentNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying instruction can not be found."</li>
	 * </ul>
	 */
	public static final CaseAssignmentRejectionCode UnderlyingPaymentNotFound = new CaseAssignmentRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingPaymentNotFound";
			definition = "Underlying instruction can not be found.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejectionCode.mmObject();
			codeName = "NFND";
		}
	};
	/**
	 * Case Assignee is not allowed to investigate on this instruction (eg. Case
	 * Assignee is not the next party in the payment chain).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorisedToInvestigate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Case Assignee is not allowed to investigate on this instruction (eg. Case Assignee is not the next party in the payment chain)."
	 * </li>
	 * </ul>
	 */
	public static final CaseAssignmentRejectionCode NotAuthorisedToInvestigate = new CaseAssignmentRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAuthorisedToInvestigate";
			definition = "Case Assignee is not allowed to investigate on this instruction (eg. Case Assignee is not the next party in the payment chain).";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejectionCode.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * Case has never been assigned before.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKNW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case has never been assigned before."</li>
	 * </ul>
	 */
	public static final CaseAssignmentRejectionCode UnknownCase = new CaseAssignmentRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownCase";
			definition = "Case has never been assigned before.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejectionCode.mmObject();
			codeName = "UKNW";
		}
	};
	/**
	 * Used when the payment instruction has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when the payment instruction has been rejected."</li>
	 * </ul>
	 */
	public static final CaseAssignmentRejectionCode PaymentRejected = new CaseAssignmentRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentRejected";
			definition = "Used when the payment instruction has been rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejectionCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Used when the payment instruction has been cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used when the payment instruction has been cancelled."</li>
	 * </ul>
	 */
	public static final CaseAssignmentRejectionCode PaymentCancelled = new CaseAssignmentRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentCancelled";
			definition = "Used when the payment instruction has been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejectionCode.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Used when the payment instruction has previously been cancelled or
	 * rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
	 * CaseAssignmentRejectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentPreviouslyCancelledOrRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when the payment instruction has previously been cancelled or rejected."
	 * </li>
	 * </ul>
	 */
	public static final CaseAssignmentRejectionCode PaymentPreviouslyCancelledOrRejected = new CaseAssignmentRejectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentPreviouslyCancelledOrRejected";
			definition = "Used when the payment instruction has previously been cancelled or rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejectionCode.mmObject();
			codeName = "PCOR";
		}
	};
	final static private LinkedHashMap<String, CaseAssignmentRejectionCode> codesByName = new LinkedHashMap<>();

	protected CaseAssignmentRejectionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NFND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseAssignmentRejectionCode";
				definition = "Specifies the reason for not accepting a Case.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseAssignmentRejectionCode.UnderlyingPaymentNotFound, com.tools20022.repository.codeset.CaseAssignmentRejectionCode.NotAuthorisedToInvestigate,
						com.tools20022.repository.codeset.CaseAssignmentRejectionCode.UnknownCase, com.tools20022.repository.codeset.CaseAssignmentRejectionCode.PaymentRejected,
						com.tools20022.repository.codeset.CaseAssignmentRejectionCode.PaymentCancelled, com.tools20022.repository.codeset.CaseAssignmentRejectionCode.PaymentPreviouslyCancelledOrRejected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnderlyingPaymentNotFound.getCodeName().get(), UnderlyingPaymentNotFound);
		codesByName.put(NotAuthorisedToInvestigate.getCodeName().get(), NotAuthorisedToInvestigate);
		codesByName.put(UnknownCase.getCodeName().get(), UnknownCase);
		codesByName.put(PaymentRejected.getCodeName().get(), PaymentRejected);
		codesByName.put(PaymentCancelled.getCodeName().get(), PaymentCancelled);
		codesByName.put(PaymentPreviouslyCancelledOrRejected.getCodeName().get(), PaymentPreviouslyCancelledOrRejected);
	}

	public static CaseAssignmentRejectionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CaseAssignmentRejectionCode[] values() {
		CaseAssignmentRejectionCode[] values = new CaseAssignmentRejectionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CaseAssignmentRejectionCode> {
		@Override
		public CaseAssignmentRejectionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CaseAssignmentRejectionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
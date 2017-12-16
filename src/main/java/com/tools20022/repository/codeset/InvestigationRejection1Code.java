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
import com.tools20022.repository.codeset.InvestigationRejection1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#UnderlyingPaymentNotFound
 * InvestigationRejection1Code.mmUnderlyingPaymentNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#NotAuthorisedToInvestigate
 * InvestigationRejection1Code.mmNotAuthorisedToInvestigate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#UnknownCase
 * InvestigationRejection1Code.mmUnknownCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#PaymentPreviouslyCancelledOrRejected
 * InvestigationRejection1Code.mmPaymentPreviouslyCancelledOrRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#WrongMessage
 * InvestigationRejection1Code.mmWrongMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#RejectNonCashRelated
 * InvestigationRejection1Code.mmRejectNonCashRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#MissingResolutionOfInvestigation
 * InvestigationRejection1Code.mmMissingResolutionOfInvestigation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
 * InvestigationRejectionCode}</li>
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
 * "InvestigationRejection1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for rejecting an investigation case."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestigationRejection1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code
	 * InvestigationRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingPaymentNotFound"</li>
	 * </ul>
	 */
	public static final InvestigationRejection1Code UnderlyingPaymentNotFound = new InvestigationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingPaymentNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejection1Code.mmObject();
			codeName = InvestigationRejectionCode.UnderlyingPaymentNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code
	 * InvestigationRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorisedToInvestigate"</li>
	 * </ul>
	 */
	public static final InvestigationRejection1Code NotAuthorisedToInvestigate = new InvestigationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorisedToInvestigate";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejection1Code.mmObject();
			codeName = InvestigationRejectionCode.NotAuthorisedToInvestigate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code
	 * InvestigationRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownCase"</li>
	 * </ul>
	 */
	public static final InvestigationRejection1Code UnknownCase = new InvestigationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownCase";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejection1Code.mmObject();
			codeName = InvestigationRejectionCode.UnknownCase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code
	 * InvestigationRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentPreviouslyCancelledOrRejected"</li>
	 * </ul>
	 */
	public static final InvestigationRejection1Code PaymentPreviouslyCancelledOrRejected = new InvestigationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPreviouslyCancelledOrRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejection1Code.mmObject();
			codeName = InvestigationRejectionCode.PaymentPreviouslyCancelledOrRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code
	 * InvestigationRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongMessage"</li>
	 * </ul>
	 */
	public static final InvestigationRejection1Code WrongMessage = new InvestigationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongMessage";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejection1Code.mmObject();
			codeName = InvestigationRejectionCode.WrongMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code
	 * InvestigationRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectNonCashRelated"</li>
	 * </ul>
	 */
	public static final InvestigationRejection1Code RejectNonCashRelated = new InvestigationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectNonCashRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejection1Code.mmObject();
			codeName = InvestigationRejectionCode.RejectNonCashRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code
	 * InvestigationRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingResolutionOfInvestigation"</li>
	 * </ul>
	 */
	public static final InvestigationRejection1Code MissingResolutionOfInvestigation = new InvestigationRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingResolutionOfInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestigationRejection1Code.mmObject();
			codeName = InvestigationRejectionCode.MissingResolutionOfInvestigation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestigationRejection1Code> codesByName = new LinkedHashMap<>();

	protected InvestigationRejection1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NFND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationRejection1Code";
				definition = "Specifies the reason for rejecting an investigation case.";
				trace_lazy = () -> InvestigationRejectionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationRejection1Code.UnderlyingPaymentNotFound, com.tools20022.repository.codeset.InvestigationRejection1Code.NotAuthorisedToInvestigate,
						com.tools20022.repository.codeset.InvestigationRejection1Code.UnknownCase, com.tools20022.repository.codeset.InvestigationRejection1Code.PaymentPreviouslyCancelledOrRejected,
						com.tools20022.repository.codeset.InvestigationRejection1Code.WrongMessage, com.tools20022.repository.codeset.InvestigationRejection1Code.RejectNonCashRelated,
						com.tools20022.repository.codeset.InvestigationRejection1Code.MissingResolutionOfInvestigation);
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

	public static InvestigationRejection1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestigationRejection1Code[] values() {
		InvestigationRejection1Code[] values = new InvestigationRejection1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestigationRejection1Code> {
		@Override
		public InvestigationRejection1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestigationRejection1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
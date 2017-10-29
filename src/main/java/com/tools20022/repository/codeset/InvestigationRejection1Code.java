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
import com.tools20022.repository.codeset.InvestigationRejectionCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for rejecting an investigation case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejectionCode
 * InvestigationRejectionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#UnderlyingPaymentNotFound
 * InvestigationRejection1Code.UnderlyingPaymentNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#NotAuthorisedToInvestigate
 * InvestigationRejection1Code.NotAuthorisedToInvestigate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#UnknownCase
 * InvestigationRejection1Code.UnknownCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#PaymentPreviouslyCancelledOrRejected
 * InvestigationRejection1Code.PaymentPreviouslyCancelledOrRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#WrongMessage
 * InvestigationRejection1Code.WrongMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#RejectNonCashRelated
 * InvestigationRejection1Code.RejectNonCashRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestigationRejection1Code#MissingResolutionOfInvestigation
 * InvestigationRejection1Code.MissingResolutionOfInvestigation}</li>
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
public class InvestigationRejection1Code extends InvestigationRejectionCode {

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
	public static final MMCode UnderlyingPaymentNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingPaymentNotFound";
			owner_lazy = () -> InvestigationRejection1Code.mmObject();
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
	public static final MMCode NotAuthorisedToInvestigate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorisedToInvestigate";
			owner_lazy = () -> InvestigationRejection1Code.mmObject();
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
	public static final MMCode UnknownCase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownCase";
			owner_lazy = () -> InvestigationRejection1Code.mmObject();
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
	public static final MMCode PaymentPreviouslyCancelledOrRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPreviouslyCancelledOrRejected";
			owner_lazy = () -> InvestigationRejection1Code.mmObject();
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
	public static final MMCode WrongMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongMessage";
			owner_lazy = () -> InvestigationRejection1Code.mmObject();
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
	public static final MMCode RejectNonCashRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectNonCashRelated";
			owner_lazy = () -> InvestigationRejection1Code.mmObject();
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
	public static final MMCode MissingResolutionOfInvestigation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingResolutionOfInvestigation";
			owner_lazy = () -> InvestigationRejection1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NFND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestigationRejection1Code";
				definition = "Specifies the reason for rejecting an investigation case.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestigationRejection1Code.UnderlyingPaymentNotFound, com.tools20022.repository.codeset.InvestigationRejection1Code.NotAuthorisedToInvestigate,
						com.tools20022.repository.codeset.InvestigationRejection1Code.UnknownCase, com.tools20022.repository.codeset.InvestigationRejection1Code.PaymentPreviouslyCancelledOrRejected,
						com.tools20022.repository.codeset.InvestigationRejection1Code.WrongMessage, com.tools20022.repository.codeset.InvestigationRejection1Code.RejectNonCashRelated,
						com.tools20022.repository.codeset.InvestigationRejection1Code.MissingResolutionOfInvestigation);
				trace_lazy = () -> InvestigationRejectionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
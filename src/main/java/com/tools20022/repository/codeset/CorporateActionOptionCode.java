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
 * Specifies the type of corporate action options offered to the account holder
 * for a corporate action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#Abstain
 * CorporateActionOptionCode.Abstain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#BonusSharePlan
 * CorporateActionOptionCode.BonusSharePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#BuyUp
 * CorporateActionOptionCode.BuyUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#Certification
 * CorporateActionOptionCode.Certification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#ConsentAndExchange
 * CorporateActionOptionCode.ConsentAndExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#ConsentAndTender
 * CorporateActionOptionCode.ConsentAndTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#ConsentDenied
 * CorporateActionOptionCode.ConsentDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#ConsentGranted
 * CorporateActionOptionCode.ConsentGranted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#Exercise
 * CorporateActionOptionCode.Exercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#Lapse
 * CorporateActionOptionCode.Lapse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#MarkDown
 * CorporateActionOptionCode.MarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#MarkUp
 * CorporateActionOptionCode.MarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#NonQualifiedInvestor
 * CorporateActionOptionCode.NonQualifiedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#Other
 * CorporateActionOptionCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#Oversubscribe
 * CorporateActionOptionCode.Oversubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#ProposedRate
 * CorporateActionOptionCode.ProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#ProxyCard
 * CorporateActionOptionCode.ProxyCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#QualifiedInvestor
 * CorporateActionOptionCode.QualifiedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#Retain
 * CorporateActionOptionCode.Retain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#SellEntitlement
 * CorporateActionOptionCode.SellEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#SplitInstruction
 * CorporateActionOptionCode.SplitInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#TaxInstruction
 * CorporateActionOptionCode.TaxInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#VoteAgainstManagement
 * CorporateActionOptionCode.VoteAgainstManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#VoteWithManagement
 * CorporateActionOptionCode.VoteWithManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#Security
 * CorporateActionOptionCode.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#Cash
 * CorporateActionOptionCode.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#CashAndSecurity
 * CorporateActionOptionCode.CashAndSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#NoAction
 * CorporateActionOptionCode.NoAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode#UnknownProceeds
 * CorporateActionOptionCode.UnknownProceeds}</li>
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
 * <li>"ABST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionOptionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of corporate action options offered to the account holder for a corporate action."
 * </li>
 * </ul>
 */
public class CorporateActionOptionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Vote expressed as abstain. In this case, the issuing company will add the
	 * number of shares to the quorum of the meeting. If the voting right is not
	 * executed, it will not be added to the quorum. In this case, code NOAC
	 * should be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote expressed as abstain. In this case, the issuing company will add the number of shares to the quorum of the meeting.\nIf the voting right is not executed, it will not be added to the quorum. In this case, code NOAC should be used."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Abstain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Abstain";
			definition = "Vote expressed as abstain. In this case, the issuing company will add the number of shares to the quorum of the meeting.\nIf the voting right is not executed, it will not be added to the quorum. In this case, code NOAC should be used.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "ABST";
		}
	};
	/**
	 * Receive equities from the share premium reserve of the company and
	 * considered as a capital distribution rather than a disbursement of income
	 * with different tax implications (typically found in Australia).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusSharePlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Receive equities from the share premium reserve of the company and considered as a capital distribution rather than a disbursement of income with different tax implications (typically found in Australia)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BonusSharePlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BonusSharePlan";
			definition = "Receive equities from the share premium reserve of the company and considered as a capital distribution rather than a disbursement of income with different tax implications (typically found in Australia).";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "BSPL";
		}
	};
	/**
	 * Buy additional securities to round up position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buy additional securities to round up position."</li>
	 * </ul>
	 */
	public static final MMCode BuyUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyUp";
			definition = "Buy additional securities to round up position.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "BUYA";
		}
	};
	/**
	 * Certification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certification is provided."</li>
	 * </ul>
	 */
	public static final MMCode Certification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Certification";
			definition = "Certification is provided.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Vote to consent to change the terms of the securities agreement and to
	 * exchange securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEXC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote to consent to change the terms of the securities agreement and to exchange securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ConsentAndExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentAndExchange";
			definition = "Vote to consent to change the terms of the securities agreement and to exchange securities.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CEXC";
		}
	};
	/**
	 * Vote to consent to change the terms of the securities agreement and to
	 * tender securities for cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote to consent to change the terms of the securities agreement and to tender securities for cash."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ConsentAndTender = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentAndTender";
			definition = "Vote to consent to change the terms of the securities agreement and to tender securities for cash.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CTEN";
		}
	};
	/**
	 * Vote not to approve the event or proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentDenied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote not to approve the event or proposal."</li>
	 * </ul>
	 */
	public static final MMCode ConsentDenied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentDenied";
			definition = "Vote not to approve the event or proposal.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CONN";
		}
	};
	/**
	 * Vote to approve the event or proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentGranted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote to approve the event or proposal."</li>
	 * </ul>
	 */
	public static final MMCode ConsentGranted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentGranted";
			definition = "Vote to approve the event or proposal.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CONY";
		}
	};
	/**
	 * Exercise intermediate securities or warrants.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercise"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exercise intermediate securities or warrants."</li>
	 * </ul>
	 */
	public static final MMCode Exercise = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exercise";
			definition = "Exercise intermediate securities or warrants.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "EXER";
		}
	};
	/**
	 * Allow event or entitled security to expire.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allow event or entitled security to expire."</li>
	 * </ul>
	 */
	public static final MMCode Lapse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lapse";
			definition = "Allow event or entitled security to expire.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "LAPS";
		}
	};
	/**
	 * Mark down the global certificate as a result of a corporate action
	 * (instruction from International Central Securities Depositories (ICSDs)
	 * to common depositories who are holding the global certificate on behalf
	 * of the International Central Securities Depositories (ICSDs)).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKDW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mark down the global certificate as a result of a corporate action (instruction from International Central Securities Depositories (ICSDs) to common depositories who are holding the global certificate on behalf of the International Central Securities Depositories (ICSDs))."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MarkDown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarkDown";
			definition = "Mark down the global certificate as a result of a corporate action (instruction from International Central Securities Depositories (ICSDs) to common depositories who are holding the global certificate on behalf of the International Central Securities Depositories (ICSDs)).";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "MKDW";
		}
	};
	/**
	 * Mark up the global certificate as a result of a corporate action
	 * (instruction from International Central Securities Depositories (ICSDs)
	 * to common depositories who are holding the global certificate on behalf
	 * of the International Central Securities Depositories (ICSDs)).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mark up the global certificate as a result of a corporate action (instruction from International Central Securities Depositories (ICSDs) to common depositories who are holding the global certificate on behalf of the International Central Securities Depositories (ICSDs))."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MarkUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarkUp";
			definition = "Mark up the global certificate as a result of a corporate action (instruction from International Central Securities Depositories (ICSDs) to common depositories who are holding the global certificate on behalf of the International Central Securities Depositories (ICSDs)).";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "MKUP";
		}
	};
	/**
	 * Account owner is a non-qualified investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonQualifiedInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account owner is a non-qualified investor."</li>
	 * </ul>
	 */
	public static final MMCode NonQualifiedInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonQualifiedInvestor";
			definition = "Account owner is a non-qualified investor.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "NOQU";
		}
	};
	/**
	 * Generic corporate action option to be used in case that no other specific
	 * code is appropriate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic corporate action option to be used in case that no other specific code is appropriate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Generic corporate action option to be used in case that no other specific code is appropriate.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Subscribe to more equities than underlying securities position allows.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Oversubscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subscribe to more equities than underlying securities position allows."</li>
	 * </ul>
	 */
	public static final MMCode Oversubscribe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Oversubscribe";
			definition = "Subscribe to more equities than underlying securities position allows.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * In a remarketing of variable notes, the margin that shareholders can
	 * propose in respect of the next interest period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a remarketing of variable notes, the margin that shareholders can propose in respect of the next interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ProposedRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProposedRate";
			definition = "In a remarketing of variable notes, the margin that shareholders can propose in respect of the next interest period.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "OFFR";
		}
	};
	/**
	 * Issue a proxy card in case of voting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue a proxy card in case of voting."</li>
	 * </ul>
	 */
	public static final MMCode ProxyCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyCard";
			definition = "Issue a proxy card in case of voting.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "PROX";
		}
	};
	/**
	 * Account owner is a qualified investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account owner is a qualified investor."</li>
	 * </ul>
	 */
	public static final MMCode QualifiedInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QualifiedInvestor";
			definition = "Account owner is a qualified investor.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "QINV";
		}
	};
	/**
	 * Option that allows a holder to elect to retain their holding, for
	 * example, a putable bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option that allows a holder to elect to retain their holding, for example, a putable bond."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Retain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Retain";
			definition = "Option that allows a holder to elect to retain their holding, for example, a putable bond.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "MPUT";
		}
	};
	/**
	 * Sell the intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sell the intermediate securities."</li>
	 * </ul>
	 */
	public static final MMCode SellEntitlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellEntitlement";
			definition = "Sell the intermediate securities.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "SLLE";
		}
	};
	/**
	 * Option to give a split instruction, for example, a split voting
	 * instruction on a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option to give a split instruction, for example, a split voting instruction on a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SplitInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitInstruction";
			definition = "Option to give a split instruction, for example, a split voting instruction on a meeting.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "SPLI";
		}
	};
	/**
	 * Tax instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax instruction."</li>
	 * </ul>
	 */
	public static final MMCode TaxInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxInstruction";
			definition = "Tax instruction.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "TAXI";
		}
	};
	/**
	 * Vote against management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteAgainstManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote against management."</li>
	 * </ul>
	 */
	public static final MMCode VoteAgainstManagement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteAgainstManagement";
			definition = "Vote against management.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "AMGT";
		}
	};
	/**
	 * Vote with management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote with management."</li>
	 * </ul>
	 */
	public static final MMCode VoteWithManagement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteWithManagement";
			definition = "Vote with management.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "MNGT";
		}
	};
	/**
	 * Distribution of securities to holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of securities to holders."</li>
	 * </ul>
	 */
	public static final MMCode Security = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Distribution of securities to holders.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Option to choose cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option to choose cash."</li>
	 * </ul>
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Option to choose cash.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Option to choose between different security and cash options.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAndSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option to choose between different security and cash options."</li>
	 * </ul>
	 */
	public static final MMCode CashAndSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAndSecurity";
			definition = "Option to choose between different security and cash options.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CASE";
		}
	};
	/**
	 * Option for the account owner not to take part in the event. This would
	 * include opt-out for class actions and lodging of dissenters' rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option for the account owner not to take part in the event. This would include opt-out for class actions and lodging of dissenters' rights."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NoAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAction";
			definition = "Option for the account owner not to take part in the event. This would include opt-out for class actions and lodging of dissenters' rights.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Proceeds not known during election period. The option can result in cash
	 * and/or securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds not known during election period. The option can result in cash and/or securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode UnknownProceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownProceeds";
			definition = "Proceeds not known during election period. The option can result in cash and/or securities.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "PRUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ABST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOptionCode";
				definition = "Specifies the type of corporate action options offered to the account holder for a corporate action.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionOptionCode.Abstain, com.tools20022.repository.codeset.CorporateActionOptionCode.BonusSharePlan,
						com.tools20022.repository.codeset.CorporateActionOptionCode.BuyUp, com.tools20022.repository.codeset.CorporateActionOptionCode.Certification,
						com.tools20022.repository.codeset.CorporateActionOptionCode.ConsentAndExchange, com.tools20022.repository.codeset.CorporateActionOptionCode.ConsentAndTender,
						com.tools20022.repository.codeset.CorporateActionOptionCode.ConsentDenied, com.tools20022.repository.codeset.CorporateActionOptionCode.ConsentGranted,
						com.tools20022.repository.codeset.CorporateActionOptionCode.Exercise, com.tools20022.repository.codeset.CorporateActionOptionCode.Lapse, com.tools20022.repository.codeset.CorporateActionOptionCode.MarkDown,
						com.tools20022.repository.codeset.CorporateActionOptionCode.MarkUp, com.tools20022.repository.codeset.CorporateActionOptionCode.NonQualifiedInvestor,
						com.tools20022.repository.codeset.CorporateActionOptionCode.Other, com.tools20022.repository.codeset.CorporateActionOptionCode.Oversubscribe, com.tools20022.repository.codeset.CorporateActionOptionCode.ProposedRate,
						com.tools20022.repository.codeset.CorporateActionOptionCode.ProxyCard, com.tools20022.repository.codeset.CorporateActionOptionCode.QualifiedInvestor,
						com.tools20022.repository.codeset.CorporateActionOptionCode.Retain, com.tools20022.repository.codeset.CorporateActionOptionCode.SellEntitlement,
						com.tools20022.repository.codeset.CorporateActionOptionCode.SplitInstruction, com.tools20022.repository.codeset.CorporateActionOptionCode.TaxInstruction,
						com.tools20022.repository.codeset.CorporateActionOptionCode.VoteAgainstManagement, com.tools20022.repository.codeset.CorporateActionOptionCode.VoteWithManagement,
						com.tools20022.repository.codeset.CorporateActionOptionCode.Security, com.tools20022.repository.codeset.CorporateActionOptionCode.Cash, com.tools20022.repository.codeset.CorporateActionOptionCode.CashAndSecurity,
						com.tools20022.repository.codeset.CorporateActionOptionCode.NoAction, com.tools20022.repository.codeset.CorporateActionOptionCode.UnknownProceeds);
			}
		});
		return mmObject_lazy.get();
	}
}
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
import com.tools20022.repository.codeset.AdditionalBusinessProcessCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the additional business process linked to a corporate action event
 * such as an automatic market claim.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#AutomaticMarketClaim
 * AdditionalBusinessProcessCode.AutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#SubjectToTransformation
 * AdditionalBusinessProcessCode.SubjectToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#CancelUnderlyingTrades
 * AdditionalBusinessProcessCode.CancelUnderlyingTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#NoAutomaticMarketClaimsAndTransformations
 * AdditionalBusinessProcessCode.NoAutomaticMarketClaimsAndTransformations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#NoSplitElection
 * AdditionalBusinessProcessCode.NoSplitElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#SchemeOrPlanOfArrangement
 * AdditionalBusinessProcessCode.SchemeOrPlanOfArrangement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#ClaimOrCompensation
 * AdditionalBusinessProcessCode.ClaimOrCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#TaxRefund
 * AdditionalBusinessProcessCode.TaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#NotificationOfReversal
 * AdditionalBusinessProcessCode.NotificationOfReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#Consent
 * AdditionalBusinessProcessCode.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#PartialMandatoryPutRedemption
 * AdditionalBusinessProcessCode.PartialMandatoryPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#FullPrefunding
 * AdditionalBusinessProcessCode.FullPrefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#PartialPreFunding
 * AdditionalBusinessProcessCode.PartialPreFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode#RequiredAction
 * AdditionalBusinessProcessCode.RequiredAction}</li>
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
 * <li>"ACLA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalBusinessProcessCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the additional business process linked to a corporate action event such as an automatic market claim."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdditionalBusinessProcessCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Will automatically give rise to market claims by the account servicer,
	 * for example, a Central Securities Depository (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticMarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Will automatically give rise to market claims by the account servicer, for example, a Central Securities Depository (CSD)."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode AutomaticMarketClaim = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutomaticMarketClaim";
			definition = "Will automatically give rise to market claims by the account servicer, for example, a Central Securities Depository (CSD).";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "ACLA";
		}
	};
	/**
	 * As a result of the corporate action, all transactions in the underlying
	 * security will be cancelled by the system and replaced with transactions
	 * in the outturn resource(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATXF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectToTransformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As a result of the corporate action, all transactions in the underlying security will be cancelled by the system and replaced with transactions in the outturn resource(s)."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode SubjectToTransformation = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubjectToTransformation";
			definition = "As a result of the corporate action, all transactions in the underlying security will be cancelled by the system and replaced with transactions in the outturn resource(s).";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "ATXF";
		}
	};
	/**
	 * As a result of the corporate action, all transactions in the underlying
	 * security will be cancelled by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUnderlyingTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As a result of the corporate action, all transactions in the underlying security will be cancelled by the system."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode CancelUnderlyingTrades = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelUnderlyingTrades";
			definition = "As a result of the corporate action, all transactions in the underlying security will be cancelled by the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "CNTR";
		}
	};
	/**
	 * Event will not automatically give rise to market claims and
	 * transformations by the account servicer, for example, a Central
	 * Securities Depository (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaimsAndTransformations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event will not automatically give rise to market claims and transformations by the account servicer, for example, a Central Securities Depository (CSD)."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode NoAutomaticMarketClaimsAndTransformations = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoAutomaticMarketClaimsAndTransformations";
			definition = "Event will not automatically give rise to market claims and transformations by the account servicer, for example, a Central Securities Depository (CSD).";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "NAMC";
		}
	};
	/**
	 * Issuer only allows a single option to be selected per designated holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSplitElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer only allows a single option to be selected per designated holding."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode NoSplitElection = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoSplitElection";
			definition = "Issuer only allows a single option to be selected per designated holding.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "NPLE";
		}
	};
	/**
	 * Component event of a scheme/plan of arrangement: a reorganisation of a
	 * company or a group of companies, and their capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCHM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeOrPlanOfArrangement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Component event of a scheme/plan of arrangement: a reorganisation of a company or a group of companies, and their capital."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode SchemeOrPlanOfArrangement = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SchemeOrPlanOfArrangement";
			definition = "Component event of a scheme/plan of arrangement: a reorganisation of a company or a group of companies, and their capital.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "SCHM";
		}
	};
	/**
	 * Relates to a claim on the associated corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimOrCompensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a claim on the associated corporate action event."</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode ClaimOrCompensation = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClaimOrCompensation";
			definition = "Relates to a claim on the associated corporate action event.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "CLAI";
		}
	};
	/**
	 * Relates to a tax refund from the authorities on the associated corporate
	 * action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a tax refund from the authorities on the associated corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode TaxRefund = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRefund";
			definition = "Relates to a tax refund from the authorities on the associated corporate action event.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "TAXR";
		}
	};
	/**
	 * Indicates a preadvice of movement reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationOfReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates a preadvice of movement reversal."</li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode NotificationOfReversal = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotificationOfReversal";
			definition = "Indicates a preadvice of movement reversal.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "REVR";
		}
	};
	/**
	 * Relates to a consent within a corporate action event other than a Consent
	 * event (: 22F:: CAEV//CONS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a consent within a corporate action event other than a Consent event (: 22F:: CAEV//CONS)."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode Consent = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Consent";
			definition = "Relates to a consent within a corporate action event other than a Consent event (: 22F:: CAEV//CONS).";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "CONS";
		}
	};
	/**
	 * Partial mandatory exchange of a portion of bonds where the exchanged
	 * securities are usually remarketed. The issuer may offer holders the right
	 * to retain instead of exchanging their securities. A lottery will be used
	 * to determine eligibility for the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialMandatoryPutRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial mandatory exchange of a portion of bonds where the exchanged securities are usually remarketed. The issuer may offer holders the right to retain instead of exchanging their securities. A lottery will be used to determine eligibility for the event."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode PartialMandatoryPutRedemption = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialMandatoryPutRedemption";
			definition = "Partial mandatory exchange of a portion of bonds where the exchanged securities are usually remarketed. The issuer may offer holders the right to retain instead of exchanging their securities. A lottery will be used to determine eligibility for the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "PPUT";
		}
	};
	/**
	 * Full pre-funding of a debt instrument by the issuer prior to original
	 * maturity when the issuer deposits assets in trust. Applicable only in the
	 * frame of a partial defeasance corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FPRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPrefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full pre-funding of a debt instrument by the issuer prior to original maturity when the issuer deposits assets in trust. Applicable only in the frame of a partial defeasance corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode FullPrefunding = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrefunding";
			definition = "Full pre-funding of a debt instrument by the issuer prior to original maturity when the issuer deposits assets in trust. Applicable only in the frame of a partial defeasance corporate action event.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "FPRE";
		}
	};
	/**
	 * Partial pre-funding of a debt instrument prior to maturity drawn through
	 * a lottery process. One new security is issued with an earlier maturity
	 * date for the refunded (called portion) and the other new security is
	 * issued with the original maturity date for the non refunded (remaining)
	 * portion. Applicable only in the frame of a partial defeasance corporate
	 * action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialPreFunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Partial pre-funding of a debt instrument prior to maturity drawn through a lottery process. One new security is issued with an earlier maturity date for the refunded (called portion) and the other new security is issued with the original maturity date for the non refunded (remaining) portion. Applicable only in the frame of a partial defeasance corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode PartialPreFunding = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPreFunding";
			definition = "Partial pre-funding of a debt instrument prior to maturity drawn through a lottery process. One new security is issued with an earlier maturity date for the refunded (called portion) and the other new security is issued with the original maturity date for the non refunded (remaining) portion. Applicable only in the frame of a partial defeasance corporate action event.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "PPRE";
		}
	};
	/**
	 * Proceeds / entitlements of the mandatory event can only be paid if
	 * specified action is taken by the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
	 * AdditionalBusinessProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds / entitlements of the mandatory event can only be paid if specified action is taken by the account owner."
	 * </li>
	 * </ul>
	 */
	public static final AdditionalBusinessProcessCode RequiredAction = new AdditionalBusinessProcessCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredAction";
			definition = "Proceeds / entitlements of the mandatory event can only be paid if specified action is taken by the account owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalBusinessProcessCode.mmObject();
			codeName = "REAC";
		}
	};
	final static private LinkedHashMap<String, AdditionalBusinessProcessCode> codesByName = new LinkedHashMap<>();

	protected AdditionalBusinessProcessCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACLA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcessCode";
				definition = "Specifies the additional business process linked to a corporate action event such as an automatic market claim.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalBusinessProcessCode.AutomaticMarketClaim, com.tools20022.repository.codeset.AdditionalBusinessProcessCode.SubjectToTransformation,
						com.tools20022.repository.codeset.AdditionalBusinessProcessCode.CancelUnderlyingTrades, com.tools20022.repository.codeset.AdditionalBusinessProcessCode.NoAutomaticMarketClaimsAndTransformations,
						com.tools20022.repository.codeset.AdditionalBusinessProcessCode.NoSplitElection, com.tools20022.repository.codeset.AdditionalBusinessProcessCode.SchemeOrPlanOfArrangement,
						com.tools20022.repository.codeset.AdditionalBusinessProcessCode.ClaimOrCompensation, com.tools20022.repository.codeset.AdditionalBusinessProcessCode.TaxRefund,
						com.tools20022.repository.codeset.AdditionalBusinessProcessCode.NotificationOfReversal, com.tools20022.repository.codeset.AdditionalBusinessProcessCode.Consent,
						com.tools20022.repository.codeset.AdditionalBusinessProcessCode.PartialMandatoryPutRedemption, com.tools20022.repository.codeset.AdditionalBusinessProcessCode.FullPrefunding,
						com.tools20022.repository.codeset.AdditionalBusinessProcessCode.PartialPreFunding, com.tools20022.repository.codeset.AdditionalBusinessProcessCode.RequiredAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AutomaticMarketClaim.getCodeName().get(), AutomaticMarketClaim);
		codesByName.put(SubjectToTransformation.getCodeName().get(), SubjectToTransformation);
		codesByName.put(CancelUnderlyingTrades.getCodeName().get(), CancelUnderlyingTrades);
		codesByName.put(NoAutomaticMarketClaimsAndTransformations.getCodeName().get(), NoAutomaticMarketClaimsAndTransformations);
		codesByName.put(NoSplitElection.getCodeName().get(), NoSplitElection);
		codesByName.put(SchemeOrPlanOfArrangement.getCodeName().get(), SchemeOrPlanOfArrangement);
		codesByName.put(ClaimOrCompensation.getCodeName().get(), ClaimOrCompensation);
		codesByName.put(TaxRefund.getCodeName().get(), TaxRefund);
		codesByName.put(NotificationOfReversal.getCodeName().get(), NotificationOfReversal);
		codesByName.put(Consent.getCodeName().get(), Consent);
		codesByName.put(PartialMandatoryPutRedemption.getCodeName().get(), PartialMandatoryPutRedemption);
		codesByName.put(FullPrefunding.getCodeName().get(), FullPrefunding);
		codesByName.put(PartialPreFunding.getCodeName().get(), PartialPreFunding);
		codesByName.put(RequiredAction.getCodeName().get(), RequiredAction);
	}

	public static AdditionalBusinessProcessCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdditionalBusinessProcessCode[] values() {
		AdditionalBusinessProcessCode[] values = new AdditionalBusinessProcessCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdditionalBusinessProcessCode> {
		@Override
		public AdditionalBusinessProcessCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdditionalBusinessProcessCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
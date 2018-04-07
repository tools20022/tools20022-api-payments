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
import com.tools20022.repository.codeset.RateTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Any and all rate is sought.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Fixed
 * RateTypeCode.Fixed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Forfeit
 * RateTypeCode.Forfeit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Variable
 * RateTypeCode.Variable}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Open
 * RateTypeCode.Open}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Unknown
 * RateTypeCode.Unknown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#NilPayment
 * RateTypeCode.NilPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#AdditionalTax
 * RateTypeCode.AdditionalTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Charges
 * RateTypeCode.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RateTypeCode#CashInLieuOfSecurities
 * RateTypeCode.CashInLieuOfSecurities}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Gross
 * RateTypeCode.Gross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#CashIncentive
 * RateTypeCode.CashIncentive}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Net
 * RateTypeCode.Net}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Sollication
 * RateTypeCode.Sollication}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#StampDuty
 * RateTypeCode.StampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RateTypeCode#StockExchangeTax
 * RateTypeCode.StockExchangeTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RateTypeCode#WithholdingTax
 * RateTypeCode.WithholdingTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#TransferTax
 * RateTypeCode.TransferTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RateTypeCode#TransactionTax
 * RateTypeCode.TransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#TaxDeferred
 * RateTypeCode.TaxDeferred}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#TaxFeeAmount
 * RateTypeCode.TaxFeeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RateTypeCode#WithholdingOfForeignTax
 * RateTypeCode.WithholdingOfForeignTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RateTypeCode#WithholdingOfLocalTax
 * RateTypeCode.WithholdingOfLocalTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Imputed
 * RateTypeCode.Imputed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Precompte
 * RateTypeCode.Precompte}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#OneTierTax
 * RateTypeCode.OneTierTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#LocalTax
 * RateTypeCode.LocalTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Scheduled
 * RateTypeCode.Scheduled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#Unscheduled
 * RateTypeCode.Unscheduled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RateTypeCode#AnyAndAll
 * RateTypeCode.AnyAndAll}</li>
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
 * <li>"FIXE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Any and all rate is sought."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RateTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate is fixed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate is fixed."</li>
	 * </ul>
	 */
	public static final RateTypeCode Fixed = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fixed";
			definition = "Rate is fixed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "FIXE";
		}
	};
	/**
	 * No specific repurchase rate applies to the transaction Repo, only a
	 * forfeit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forfeit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "No specific repurchase rate applies to the transaction Repo, only a forfeit."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode Forfeit = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Forfeit";
			definition = "No specific repurchase rate applies to the transaction Repo, only a forfeit.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Rate is variable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Variable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate is variable."</li>
	 * </ul>
	 */
	public static final RateTypeCode Variable = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Variable";
			definition = "Rate is variable.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "VARI";
		}
	};
	/**
	 * Rate has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate has not been established."</li>
	 * </ul>
	 */
	public static final RateTypeCode Open = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Open";
			definition = "Rate has not been established.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Rate is unknown by the sender or has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate is unknown by the sender or has not been established."</li>
	 * </ul>
	 */
	public static final RateTypeCode Unknown = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Rate is unknown by the sender or has not been established.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Rate will not be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NILP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NilPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate will not be paid."</li>
	 * </ul>
	 */
	public static final RateTypeCode NilPayment = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NilPayment";
			definition = "Rate will not be paid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "NILP";
		}
	};
	/**
	 * Rate used for additional tax that cannot be categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for additional tax that cannot be categorised."</li>
	 * </ul>
	 */
	public static final RateTypeCode AdditionalTax = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "ATAX";
		}
	};
	/**
	 * Rate used to calculate the amount of the charges/fees that cannot be
	 * categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of the charges/fees that cannot be categorised."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode Charges = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Rate used to calculate the cash disbursement in lieu of a fractional
	 * quantity of, for example, equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the cash disbursement in lieu of a fractional quantity of, for example, equity."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode CashInLieuOfSecurities = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSecurities";
			definition = "Rate used to calculate the cash disbursement in lieu of a fractional quantity of, for example, equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "CINL";
		}
	};
	/**
	 * Cash dividend per equity before deductions or allowances have been made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend per equity before deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode Gross = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gross";
			definition = "Cash dividend per equity before deductions or allowances have been made.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "GRSS";
		}
	};
	/**
	 * Rate of the cash premium made available if the securities holder consents
	 * or participates to an event, for example, consent fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the cash premium made available if the securities holder consents or participates to an event, for example, consent fees."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode CashIncentive = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashIncentive";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, for example, consent fees.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "INCE";
		}
	};
	/**
	 * Relates to the netting of settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Net"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to the netting of settlement instructions."</li>
	 * </ul>
	 */
	public static final RateTypeCode Net = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Net";
			definition = "Relates to the netting of settlement instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Cash rate made available in an offer in order to encourage participation
	 * in the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sollication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate made available in an offer in order to encourage participation in the offer."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode Sollication = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sollication";
			definition = "Cash rate made available in an offer in order to encourage participation in the offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "SOFE";
		}
	};
	/**
	 * Financial instrument has not been stamped and/or duly signed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument has not been stamped and/or duly signed."</li>
	 * </ul>
	 */
	public static final RateTypeCode StampDuty = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDuty";
			definition = "Financial instrument has not been stamped and/or duly signed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Rate of stock exchange tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchangeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of stock exchange tax."</li>
	 * </ul>
	 */
	public static final RateTypeCode StockExchangeTax = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockExchangeTax";
			definition = "Rate of stock exchange tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "STEX";
		}
	};
	/**
	 * Relates to a tax refund from the authorities on the associated corporate
	 * action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a tax refund from the authorities on the associated corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode WithholdingTax = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingTax";
			definition = "Relates to a tax refund from the authorities on the associated corporate action event.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "TAXR";
		}
	};
	/**
	 * Transaction has been generated due to transformation following a
	 * corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated due to transformation following a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode TransferTax = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Transaction has been generated due to transformation following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Rate used to calculate the amount of transaction tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used to calculate the amount of transaction tax."</li>
	 * </ul>
	 */
	public static final RateTypeCode TransactionTax = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Rate used to calculate the amount of transaction tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "TRAX";
		}
	};
	/**
	 * Rate relating to the underlying security for which tax is deferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate relating to the underlying security for which tax is deferred."</li>
	 * </ul>
	 */
	public static final RateTypeCode TaxDeferred = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDeferred";
			definition = "Rate relating to the underlying security for which tax is deferred.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "TXDF";
		}
	};
	/**
	 * Rate relating to the underlying security which is not taxable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFeeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate relating to the underlying security which is not taxable."</li>
	 * </ul>
	 */
	public static final RateTypeCode TaxFeeAmount = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxFeeAmount";
			definition = "Rate relating to the underlying security which is not taxable.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "TXFR";
		}
	};
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the income was originally paid, for which relief at source and/or reclaim
	 * may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfForeignTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode WithholdingOfForeignTax = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingOfForeignTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "WITF";
		}
	};
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the account owner is located, for which relief at source and/or reclaim
	 * may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfLocalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode WithholdingOfLocalTax = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingOfLocalTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "WITL";
		}
	};
	/**
	 * Imputed tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IMPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Imputed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Imputed tax."</li>
	 * </ul>
	 */
	public static final RateTypeCode Imputed = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Imputed";
			definition = "Imputed tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "IMPU";
		}
	};
	/**
	 * Rate is a precompte.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Precompte"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate is a precompte."</li>
	 * </ul>
	 */
	public static final RateTypeCode Precompte = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Precompte";
			definition = "Rate is a precompte.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "PREC";
		}
	};
	/**
	 * Rate is a one tier tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneTierTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate is a one tier tax."</li>
	 * </ul>
	 */
	public static final RateTypeCode OneTierTax = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OneTierTax";
			definition = "Rate is a one tier tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "TIER";
		}
	};
	/**
	 * Interest liable for interest down payment tax (proportion of gross
	 * interest per unit/interim profits that is not covered by the credit in
	 * the interest pool).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool)."
	 * </li>
	 * </ul>
	 */
	public static final RateTypeCode LocalTax = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalTax";
			definition = "Interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool).";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "LIDT";
		}
	};
	/**
	 * Rate of the scheduled payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scheduled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of the scheduled payment."</li>
	 * </ul>
	 */
	public static final RateTypeCode Scheduled = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scheduled";
			definition = "Rate of the scheduled payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "SCHD";
		}
	};
	/**
	 * Rate of the unscheduled payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unscheduled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of the unscheduled payment."</li>
	 * </ul>
	 */
	public static final RateTypeCode Unscheduled = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unscheduled";
			definition = "Rate of the unscheduled payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "USCD";
		}
	};
	/**
	 * Any and all rate is sought.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RateTypeCode RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANYA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyAndAll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Any and all rate is sought."</li>
	 * </ul>
	 */
	public static final RateTypeCode AnyAndAll = new RateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnyAndAll";
			definition = "Any and all rate is sought.";
			owner_lazy = () -> com.tools20022.repository.codeset.RateTypeCode.mmObject();
			codeName = "ANYA";
		}
	};
	final static private LinkedHashMap<String, RateTypeCode> codesByName = new LinkedHashMap<>();

	protected RateTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateTypeCode";
				definition = "Any and all rate is sought.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RateTypeCode.Fixed, com.tools20022.repository.codeset.RateTypeCode.Forfeit, com.tools20022.repository.codeset.RateTypeCode.Variable,
						com.tools20022.repository.codeset.RateTypeCode.Open, com.tools20022.repository.codeset.RateTypeCode.Unknown, com.tools20022.repository.codeset.RateTypeCode.NilPayment,
						com.tools20022.repository.codeset.RateTypeCode.AdditionalTax, com.tools20022.repository.codeset.RateTypeCode.Charges, com.tools20022.repository.codeset.RateTypeCode.CashInLieuOfSecurities,
						com.tools20022.repository.codeset.RateTypeCode.Gross, com.tools20022.repository.codeset.RateTypeCode.CashIncentive, com.tools20022.repository.codeset.RateTypeCode.Net,
						com.tools20022.repository.codeset.RateTypeCode.Sollication, com.tools20022.repository.codeset.RateTypeCode.StampDuty, com.tools20022.repository.codeset.RateTypeCode.StockExchangeTax,
						com.tools20022.repository.codeset.RateTypeCode.WithholdingTax, com.tools20022.repository.codeset.RateTypeCode.TransferTax, com.tools20022.repository.codeset.RateTypeCode.TransactionTax,
						com.tools20022.repository.codeset.RateTypeCode.TaxDeferred, com.tools20022.repository.codeset.RateTypeCode.TaxFeeAmount, com.tools20022.repository.codeset.RateTypeCode.WithholdingOfForeignTax,
						com.tools20022.repository.codeset.RateTypeCode.WithholdingOfLocalTax, com.tools20022.repository.codeset.RateTypeCode.Imputed, com.tools20022.repository.codeset.RateTypeCode.Precompte,
						com.tools20022.repository.codeset.RateTypeCode.OneTierTax, com.tools20022.repository.codeset.RateTypeCode.LocalTax, com.tools20022.repository.codeset.RateTypeCode.Scheduled,
						com.tools20022.repository.codeset.RateTypeCode.Unscheduled, com.tools20022.repository.codeset.RateTypeCode.AnyAndAll);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(Forfeit.getCodeName().get(), Forfeit);
		codesByName.put(Variable.getCodeName().get(), Variable);
		codesByName.put(Open.getCodeName().get(), Open);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(NilPayment.getCodeName().get(), NilPayment);
		codesByName.put(AdditionalTax.getCodeName().get(), AdditionalTax);
		codesByName.put(Charges.getCodeName().get(), Charges);
		codesByName.put(CashInLieuOfSecurities.getCodeName().get(), CashInLieuOfSecurities);
		codesByName.put(Gross.getCodeName().get(), Gross);
		codesByName.put(CashIncentive.getCodeName().get(), CashIncentive);
		codesByName.put(Net.getCodeName().get(), Net);
		codesByName.put(Sollication.getCodeName().get(), Sollication);
		codesByName.put(StampDuty.getCodeName().get(), StampDuty);
		codesByName.put(StockExchangeTax.getCodeName().get(), StockExchangeTax);
		codesByName.put(WithholdingTax.getCodeName().get(), WithholdingTax);
		codesByName.put(TransferTax.getCodeName().get(), TransferTax);
		codesByName.put(TransactionTax.getCodeName().get(), TransactionTax);
		codesByName.put(TaxDeferred.getCodeName().get(), TaxDeferred);
		codesByName.put(TaxFeeAmount.getCodeName().get(), TaxFeeAmount);
		codesByName.put(WithholdingOfForeignTax.getCodeName().get(), WithholdingOfForeignTax);
		codesByName.put(WithholdingOfLocalTax.getCodeName().get(), WithholdingOfLocalTax);
		codesByName.put(Imputed.getCodeName().get(), Imputed);
		codesByName.put(Precompte.getCodeName().get(), Precompte);
		codesByName.put(OneTierTax.getCodeName().get(), OneTierTax);
		codesByName.put(LocalTax.getCodeName().get(), LocalTax);
		codesByName.put(Scheduled.getCodeName().get(), Scheduled);
		codesByName.put(Unscheduled.getCodeName().get(), Unscheduled);
		codesByName.put(AnyAndAll.getCodeName().get(), AnyAndAll);
	}

	public static RateTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RateTypeCode[] values() {
		RateTypeCode[] values = new RateTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RateTypeCode> {
		@Override
		public RateTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RateTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TaxTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of tax.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#ValueAddedTaxOfZeroRate
 * TaxTypeCode.ValueAddedTaxOfZeroRate}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#Provincial
 * TaxTypeCode.Provincial}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#NationalTax
 * TaxTypeCode.NationalTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#StateTax
 * TaxTypeCode.StateTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#WithholdingTax
 * TaxTypeCode.WithholdingTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#CapitalGainTax
 * TaxTypeCode.CapitalGainTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#InterimProfitTax
 * TaxTypeCode.InterimProfitTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#StampDuty
 * TaxTypeCode.StampDuty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#WealthTax
 * TaxTypeCode.WealthTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#InheritanceTax
 * TaxTypeCode.InheritanceTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#SolidaritySurcharge
 * TaxTypeCode.SolidaritySurcharge}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#TaxCredit
 * TaxTypeCode.TaxCredit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#Equalisation
 * TaxTypeCode.Equalisation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#GiftTax
 * TaxTypeCode.GiftTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#ConsumptionTax
 * TaxTypeCode.ConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#AlternativeMinimumTax
 * TaxTypeCode.AlternativeMinimumTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#LocalTax
 * TaxTypeCode.LocalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#NationalFederalTax
 * TaxTypeCode.NationalFederalTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#PaymentLevyTax
 * TaxTypeCode.PaymentLevyTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#StockExchangeTax
 * TaxTypeCode.StockExchangeTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#TransactionTax
 * TaxTypeCode.TransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#TransferTax
 * TaxTypeCode.TransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#ValueAddedTax
 * TaxTypeCode.ValueAddedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#LocalBrokerCommission
 * TaxTypeCode.LocalBrokerCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#ExecutingBrokerCommission
 * TaxTypeCode.ExecutingBrokerCommission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#EUTaxRetention
 * TaxTypeCode.EUTaxRetention}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#Aktiengewinn1
 * TaxTypeCode.Aktiengewinn1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#Aktiengewinn2
 * TaxTypeCode.Aktiengewinn2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#Zwischengewinn
 * TaxTypeCode.Zwischengewinn}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#CustomsTax
 * TaxTypeCode.CustomsTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#Other
 * TaxTypeCode.Other}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxTypeCode#Mietgewinn
 * TaxTypeCode.Mietgewinn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#GermanLocalTax3
 * TaxTypeCode.GermanLocalTax3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#GermanLocalTax4
 * TaxTypeCode.GermanLocalTax4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#GermanLocalTax2
 * TaxTypeCode.GermanLocalTax2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#WithholdingOfForeignTax
 * TaxTypeCode.WithholdingOfForeignTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#WithholdingOfLocalTax
 * TaxTypeCode.WithholdingOfLocalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode#CapitalLossCredit
 * TaxTypeCode.CapitalLossCredit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :19A::COAX</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"VATB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of tax."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax for which a zero rate applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VATB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxOfZeroRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax for which a zero rate applies."</li>
	 * </ul>
	 */
	public static final TaxTypeCode ValueAddedTaxOfZeroRate = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTaxOfZeroRate";
			definition = "Tax for which a zero rate applies.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "VATB";
		}
	};
	/**
	 * Tax is a provincial tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Provincial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is a provincial tax."</li>
	 * </ul>
	 */
	public static final TaxTypeCode Provincial = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Provincial";
			definition = "Tax is a provincial tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "PROV";
		}
	};
	/**
	 * Tax is a national tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NATI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is a national tax."</li>
	 * </ul>
	 */
	public static final TaxTypeCode NationalTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NationalTax";
			definition = "Tax is a national tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "NATI";
		}
	};
	/**
	 * Tax is a state tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StateTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is a state tax."</li>
	 * </ul>
	 */
	public static final TaxTypeCode StateTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StateTax";
			definition = "Tax is a state tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "STAT";
		}
	};
	/**
	 * Tax is on income deducted at source, which the paying agent is legally
	 * obliged to deduct from its payments of interest on deposits and other
	 * proceeds of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax is on income deducted at source, which the paying agent is legally obliged to deduct from its payments of interest on deposits and other proceeds of a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode WithholdingTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingTax";
			definition = "Tax is on income deducted at source, which the paying agent is legally obliged to deduct from its payments of interest on deposits and other proceeds of a financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Tax is on a capital gain (realised and unrealised), ie, the profit that
	 * is gained from the sale of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KAPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax is on a capital gain (realised and unrealised), ie, the profit that is gained from the sale of a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode CapitalGainTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalGainTax";
			definition = "Tax is on a capital gain (realised and unrealised), ie, the profit that is gained from the sale of a financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "KAPA";
		}
	};
	/**
	 * Tax is on the sum of all earnings/revenues accrued since the last
	 * dividend distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimProfitTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax is on the sum of all earnings/revenues accrued since the last dividend distribution."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode InterimProfitTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterimProfitTax";
			definition = "Tax is on the sum of all earnings/revenues accrued since the last dividend distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "INPO";
		}
	};
	/**
	 * Tax is on certain documents and transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
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
	 * definition} = "Tax is on certain documents and transactions."</li>
	 * </ul>
	 */
	public static final TaxTypeCode StampDuty = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDuty";
			definition = "Tax is on certain documents and transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Tax is a special tax imposed, applicable only when the value of assets or
	 * categories of assets owned by an entity are above a given ceiling defined
	 * by the tax authority. Wealth tax is not linked to income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WealthTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax is a special tax imposed, applicable only when the value of assets or categories of assets owned by an entity are above a given ceiling defined by the tax authority. Wealth tax is not linked to income."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode WealthTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WealthTax";
			definition = "Tax is a special tax imposed, applicable only when the value of assets or categories of assets owned by an entity are above a given ceiling defined by the tax authority. Wealth tax is not linked to income.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "WTAX";
		}
	};
	/**
	 * Tax that is payable at the time of death on any items (money or
	 * otherwise), where ownership changes either upon death or within a legally
	 * specified number of years before death.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INHT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InheritanceTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax that is payable at the time of death on any items (money or otherwise), where ownership changes either upon death or within a legally specified number of years before death."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode InheritanceTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InheritanceTax";
			definition = "Tax that is payable at the time of death on any items (money or otherwise), where ownership changes either upon death or within a legally specified number of years before death.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "INHT";
		}
	};
	/**
	 * Tax that is levied by legal authorities for solidarity purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolidaritySurcharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax that is levied by legal authorities for solidarity purposes."</li>
	 * </ul>
	 */
	public static final TaxTypeCode SolidaritySurcharge = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SolidaritySurcharge";
			definition = "Tax that is levied by legal authorities for solidarity purposes.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "SOSU";
		}
	};
	/**
	 * Direct reduction of an individual's tax liability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Direct reduction of an individual's tax liability."</li>
	 * </ul>
	 */
	public static final TaxTypeCode TaxCredit = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxCredit";
			definition = "Direct reduction of an individual's tax liability.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "CTAX";
		}
	};
	/**
	 * The part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive / performance fees at the end of the fiscal year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode Equalisation = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Equalisation";
			definition = "The part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "EQUL";
		}
	};
	/**
	 * Tax that is levied on assets given to individuals prior to the death of
	 * the donor. Gift tax is designed to ensure the integrity of the
	 * inheritance tax, preventing the pre-death transfer of wealth.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GIFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GiftTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax that is levied on assets given to individuals prior to the death of the donor. Gift tax is designed to ensure the integrity of the inheritance tax, preventing the pre-death transfer of wealth."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode GiftTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GiftTax";
			definition = "Tax that is levied on assets given to individuals prior to the death of the donor. Gift tax is designed to ensure the integrity of the inheritance tax, preventing the pre-death transfer of wealth.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "GIFT";
		}
	};
	/**
	 * Tax that is levied on goods and services purchased by customers, and is
	 * added to the retail price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumptionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax that is levied on goods and services purchased by customers, and is added to the retail price."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode ConsumptionTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsumptionTax";
			definition = "Tax that is levied on goods and services purchased by customers, and is added to the retail price.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "COAX";
		}
	};
	/**
	 * Tax is an alternative minimum tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeMinimumTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is an alternative minimum tax."</li>
	 * </ul>
	 */
	public static final TaxTypeCode AlternativeMinimumTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlternativeMinimumTax";
			definition = "Tax is an alternative minimum tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "ALMI";
		}
	};
	/**
	 * Tax that is charged by a local settlement system or local jurisdiction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax that is charged by a local settlement system or local jurisdiction."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode LocalTax = new TaxTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalTax";
			definition = "Tax that is charged by a local settlement system or local jurisdiction.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "LOCL";
		}
	};
	/**
	 * Tax is a country, national, or federal tax that is usually charged by the
	 * custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::COUN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalFederalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax is a country, national, or federal tax that is usually charged by the custodian."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode NationalFederalTax = new TaxTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COUN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NationalFederalTax";
			definition = "Tax is a country, national, or federal tax that is usually charged by the custodian.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "COUN";
		}
	};
	/**
	 * Tax levied on a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEVY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LEVY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentLevyTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax levied on a payment."</li>
	 * </ul>
	 */
	public static final TaxTypeCode PaymentLevyTax = new TaxTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LEVY"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentLevyTax";
			definition = "Tax levied on a payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "LEVY";
		}
	};
	/**
	 * Tax collected by a stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::STEX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchangeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax collected by a stock exchange."</li>
	 * </ul>
	 */
	public static final TaxTypeCode StockExchangeTax = new TaxTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::STEX"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockExchangeTax";
			definition = "Tax collected by a stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "STEX";
		}
	};
	/**
	 * Tax levied on a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TRAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax levied on a transaction."</li>
	 * </ul>
	 */
	public static final TaxTypeCode TransactionTax = new TaxTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAX"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax levied on a transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "TRAX";
		}
	};
	/**
	 * Tax levied on a transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TRAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax levied on a transfer."</li>
	 * </ul>
	 */
	public static final TaxTypeCode TransferTax = new TaxTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRAN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Tax levied on a transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Tax is a value added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VATA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::VATA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is a value added tax."</li>
	 * </ul>
	 */
	public static final TaxTypeCode ValueAddedTax = new TaxTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::VATA"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTax";
			definition = "Tax is a value added tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "VATA";
		}
	};
	/**
	 * Local broker's commission amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::LOCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local broker's commission amount."</li>
	 * </ul>
	 */
	public static final TaxTypeCode LocalBrokerCommission = new TaxTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::LOCO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalBrokerCommission";
			definition = "Local broker's commission amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "LOCO";
		}
	};
	/**
	 * Executing broker's commission amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::EXEC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Executing broker's commission amount."</li>
	 * </ul>
	 */
	public static final TaxTypeCode ExecutingBrokerCommission = new TaxTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::EXEC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutingBrokerCommission";
			definition = "Executing broker's commission amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Tax withheld at source in the framework of the European Directive on
	 * taxation of savings in the form of interest payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUTaxRetention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax withheld at source in the framework of the European Directive on taxation of savings in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode EUTaxRetention = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUTaxRetention";
			definition = "Tax withheld at source in the framework of the European Directive on taxation of savings in the form of interest payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "EUTR";
		}
	};
	/**
	 * Share-related profit. This is a tax specific to the German market. The
	 * share-related-profit gives the fund the opportunity to pass on to the
	 * institutional investor redeeming fund units certain tax-free income from
	 * equity. The calculation method is based on the old Investment Tax Act
	 * (Investmentsteuergesetz).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AKT1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aktiengewinn1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Share-related profit. This is a tax specific to the German market. The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the old Investment Tax Act (Investmentsteuergesetz)."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode Aktiengewinn1 = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Aktiengewinn1";
			definition = "Share-related profit. This is a tax specific to the German market. The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the old Investment Tax Act (Investmentsteuergesetz).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "AKT1";
		}
	};
	/**
	 * Share-related profit. This is a tax specific to the German market. The
	 * share-related-profit gives the fund the opportunity to pass on to the
	 * institutional investor redeeming fund units certain tax-free income from
	 * equity. The calculation method is based on the new Investment Tax Act
	 * (Investmentsteuergesetz).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AKT2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aktiengewinn2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Share-related profit. This is a tax specific to the German market. The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the new Investment Tax Act (Investmentsteuergesetz)."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode Aktiengewinn2 = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Aktiengewinn2";
			definition = "Share-related profit. This is a tax specific to the German market. The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the new Investment Tax Act (Investmentsteuergesetz).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "AKT2";
		}
	};
	/**
	 * Zwischengewinn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZWIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Zwischengewinn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Zwischengewinn."</li>
	 * </ul>
	 */
	public static final TaxTypeCode Zwischengewinn = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Zwischengewinn";
			definition = "Zwischengewinn.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "ZWIS";
		}
	};
	/**
	 * Tax is customs and excise.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomsTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is customs and excise."</li>
	 * </ul>
	 */
	public static final TaxTypeCode CustomsTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomsTax";
			definition = "Tax is customs and excise.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Another type of tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
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
	 * definition} = "Another type of tax."</li>
	 * </ul>
	 */
	public static final TaxTypeCode Other = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Earnings from renting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mietgewinn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earnings from renting."</li>
	 * </ul>
	 */
	public static final TaxTypeCode Mietgewinn = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mietgewinn";
			definition = "Earnings from renting.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "MIET";
		}
	};
	/**
	 * Local tax (Zinstopf) offset interest per unit against tax exempt amount
	 * (variation to offset interest per unit in relation to tax exempt amount).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanLocalTax3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax (Zinstopf) offset interest per unit against tax exempt amount (variation to offset interest per unit in relation to tax exempt amount)."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode GermanLocalTax3 = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GermanLocalTax3";
			definition = "Local tax (Zinstopf) offset interest per unit against tax exempt amount (variation to offset interest per unit in relation to tax exempt amount).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "LOTE";
		}
	};
	/**
	 * Local tax (Ertrag Besitzanteilig) yield liable for interest down payment
	 * tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LYDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanLocalTax4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax (Ertrag Besitzanteilig) yield liable for interest down payment tax."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode GermanLocalTax4 = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GermanLocalTax4";
			definition = "Local tax (Ertrag Besitzanteilig) yield liable for interest down payment tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "LYDT";
		}
	};
	/**
	 * Local tax (ZAS pflichtige Zinsen) - interest liable for interest down
	 * payment tax (proportion of gross interest per unit/interim profits that
	 * is not covered by the credit in the interest pool).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanLocalTax2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax (ZAS pflichtige Zinsen) - interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool)."
	 * </li>
	 * </ul>
	 */
	public static final TaxTypeCode GermanLocalTax2 = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GermanLocalTax2";
			definition = "Local tax (ZAS pflichtige Zinsen) - interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool).";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "LIDT";
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
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
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
	public static final TaxTypeCode WithholdingOfForeignTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingOfForeignTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
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
	public static final TaxTypeCode WithholdingOfLocalTax = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingOfLocalTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "WITL";
		}
	};
	/**
	 * Tax recovery is due to capital loss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NKAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalLossCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax recovery is due to capital loss."</li>
	 * </ul>
	 */
	public static final TaxTypeCode CapitalLossCredit = new TaxTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalLossCredit";
			definition = "Tax recovery is due to capital loss.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxTypeCode.mmObject();
			codeName = "NKAP";
		}
	};
	final static private LinkedHashMap<String, TaxTypeCode> codesByName = new LinkedHashMap<>();

	protected TaxTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::COAX"));
				example = Arrays.asList("VATB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxTypeCode";
				definition = "Specifies the type of tax.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxTypeCode.ValueAddedTaxOfZeroRate, com.tools20022.repository.codeset.TaxTypeCode.Provincial, com.tools20022.repository.codeset.TaxTypeCode.NationalTax,
						com.tools20022.repository.codeset.TaxTypeCode.StateTax, com.tools20022.repository.codeset.TaxTypeCode.WithholdingTax, com.tools20022.repository.codeset.TaxTypeCode.CapitalGainTax,
						com.tools20022.repository.codeset.TaxTypeCode.InterimProfitTax, com.tools20022.repository.codeset.TaxTypeCode.StampDuty, com.tools20022.repository.codeset.TaxTypeCode.WealthTax,
						com.tools20022.repository.codeset.TaxTypeCode.InheritanceTax, com.tools20022.repository.codeset.TaxTypeCode.SolidaritySurcharge, com.tools20022.repository.codeset.TaxTypeCode.TaxCredit,
						com.tools20022.repository.codeset.TaxTypeCode.Equalisation, com.tools20022.repository.codeset.TaxTypeCode.GiftTax, com.tools20022.repository.codeset.TaxTypeCode.ConsumptionTax,
						com.tools20022.repository.codeset.TaxTypeCode.AlternativeMinimumTax, com.tools20022.repository.codeset.TaxTypeCode.LocalTax, com.tools20022.repository.codeset.TaxTypeCode.NationalFederalTax,
						com.tools20022.repository.codeset.TaxTypeCode.PaymentLevyTax, com.tools20022.repository.codeset.TaxTypeCode.StockExchangeTax, com.tools20022.repository.codeset.TaxTypeCode.TransactionTax,
						com.tools20022.repository.codeset.TaxTypeCode.TransferTax, com.tools20022.repository.codeset.TaxTypeCode.ValueAddedTax, com.tools20022.repository.codeset.TaxTypeCode.LocalBrokerCommission,
						com.tools20022.repository.codeset.TaxTypeCode.ExecutingBrokerCommission, com.tools20022.repository.codeset.TaxTypeCode.EUTaxRetention, com.tools20022.repository.codeset.TaxTypeCode.Aktiengewinn1,
						com.tools20022.repository.codeset.TaxTypeCode.Aktiengewinn2, com.tools20022.repository.codeset.TaxTypeCode.Zwischengewinn, com.tools20022.repository.codeset.TaxTypeCode.CustomsTax,
						com.tools20022.repository.codeset.TaxTypeCode.Other, com.tools20022.repository.codeset.TaxTypeCode.Mietgewinn, com.tools20022.repository.codeset.TaxTypeCode.GermanLocalTax3,
						com.tools20022.repository.codeset.TaxTypeCode.GermanLocalTax4, com.tools20022.repository.codeset.TaxTypeCode.GermanLocalTax2, com.tools20022.repository.codeset.TaxTypeCode.WithholdingOfForeignTax,
						com.tools20022.repository.codeset.TaxTypeCode.WithholdingOfLocalTax, com.tools20022.repository.codeset.TaxTypeCode.CapitalLossCredit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ValueAddedTaxOfZeroRate.getCodeName().get(), ValueAddedTaxOfZeroRate);
		codesByName.put(Provincial.getCodeName().get(), Provincial);
		codesByName.put(NationalTax.getCodeName().get(), NationalTax);
		codesByName.put(StateTax.getCodeName().get(), StateTax);
		codesByName.put(WithholdingTax.getCodeName().get(), WithholdingTax);
		codesByName.put(CapitalGainTax.getCodeName().get(), CapitalGainTax);
		codesByName.put(InterimProfitTax.getCodeName().get(), InterimProfitTax);
		codesByName.put(StampDuty.getCodeName().get(), StampDuty);
		codesByName.put(WealthTax.getCodeName().get(), WealthTax);
		codesByName.put(InheritanceTax.getCodeName().get(), InheritanceTax);
		codesByName.put(SolidaritySurcharge.getCodeName().get(), SolidaritySurcharge);
		codesByName.put(TaxCredit.getCodeName().get(), TaxCredit);
		codesByName.put(Equalisation.getCodeName().get(), Equalisation);
		codesByName.put(GiftTax.getCodeName().get(), GiftTax);
		codesByName.put(ConsumptionTax.getCodeName().get(), ConsumptionTax);
		codesByName.put(AlternativeMinimumTax.getCodeName().get(), AlternativeMinimumTax);
		codesByName.put(LocalTax.getCodeName().get(), LocalTax);
		codesByName.put(NationalFederalTax.getCodeName().get(), NationalFederalTax);
		codesByName.put(PaymentLevyTax.getCodeName().get(), PaymentLevyTax);
		codesByName.put(StockExchangeTax.getCodeName().get(), StockExchangeTax);
		codesByName.put(TransactionTax.getCodeName().get(), TransactionTax);
		codesByName.put(TransferTax.getCodeName().get(), TransferTax);
		codesByName.put(ValueAddedTax.getCodeName().get(), ValueAddedTax);
		codesByName.put(LocalBrokerCommission.getCodeName().get(), LocalBrokerCommission);
		codesByName.put(ExecutingBrokerCommission.getCodeName().get(), ExecutingBrokerCommission);
		codesByName.put(EUTaxRetention.getCodeName().get(), EUTaxRetention);
		codesByName.put(Aktiengewinn1.getCodeName().get(), Aktiengewinn1);
		codesByName.put(Aktiengewinn2.getCodeName().get(), Aktiengewinn2);
		codesByName.put(Zwischengewinn.getCodeName().get(), Zwischengewinn);
		codesByName.put(CustomsTax.getCodeName().get(), CustomsTax);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Mietgewinn.getCodeName().get(), Mietgewinn);
		codesByName.put(GermanLocalTax3.getCodeName().get(), GermanLocalTax3);
		codesByName.put(GermanLocalTax4.getCodeName().get(), GermanLocalTax4);
		codesByName.put(GermanLocalTax2.getCodeName().get(), GermanLocalTax2);
		codesByName.put(WithholdingOfForeignTax.getCodeName().get(), WithholdingOfForeignTax);
		codesByName.put(WithholdingOfLocalTax.getCodeName().get(), WithholdingOfLocalTax);
		codesByName.put(CapitalLossCredit.getCodeName().get(), CapitalLossCredit);
	}

	public static TaxTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxTypeCode[] values() {
		TaxTypeCode[] values = new TaxTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxTypeCode> {
		@Override
		public TaxTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
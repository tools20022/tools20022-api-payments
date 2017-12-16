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
import com.tools20022.repository.codeset.FundCashAccountCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the cash account type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#CashAccount
 * FundCashAccountCode.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#PensionFundOrdinary
 * FundCashAccountCode.mmPensionFundOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#PensionFundSpecial
 * FundCashAccountCode.mmPensionFundSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#RetirementScheme
 * FundCashAccountCode.mmRetirementScheme}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundCashAccountCode#Other
 * FundCashAccountCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#HedgeFund
 * FundCashAccountCode.mmHedgeFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#WorkplacePensionSchema
 * FundCashAccountCode.mmWorkplacePensionSchema}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#PrivatePensionScheme
 * FundCashAccountCode.mmPrivatePensionScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#CSDParticipantAccount
 * FundCashAccountCode.mmCSDParticipantAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#CSDMirrorAccount
 * FundCashAccountCode.mmCSDMirrorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#InterCSDAccount
 * FundCashAccountCode.mmInterCSDAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#TechnicalOffsetAccount
 * FundCashAccountCode.mmTechnicalOffsetAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#CSDOmnibusAccount
 * FundCashAccountCode.mmCSDOmnibusAccount}</li>
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
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundCashAccountCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash account type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundCashAccountCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode CashAccount = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Central Provident Fund (CPF) ordinary account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFundOrdinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Central Provident Fund (CPF) ordinary account."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode PensionFundOrdinary = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PensionFundOrdinary";
			definition = "Central Provident Fund (CPF) ordinary account.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "CPFO";
		}
	};
	/**
	 * Central Provident Fund (CPF) special account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFundSpecial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Central Provident Fund (CPF) special account."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode PensionFundSpecial = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PensionFundSpecial";
			definition = "Central Provident Fund (CPF) special account.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "CPFS";
		}
	};
	/**
	 * Supplementary Retirement Scheme (SRS) account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Supplementary Retirement Scheme (SRS) account."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode RetirementScheme = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetirementScheme";
			definition = "Supplementary Retirement Scheme (SRS) account.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "SRSA";
		}
	};
	/**
	 * Another type cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
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
	 * definition} = "Another type cash account."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode Other = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Hedge fund account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HEDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HedgeFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hedge fund account."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode HedgeFund = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HedgeFund";
			definition = "Hedge fund account.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "HEDG";
		}
	};
	/**
	 * Workplace or company pension account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkplacePensionSchema"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Workplace or company pension account."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode WorkplacePensionSchema = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkplacePensionSchema";
			definition = "Workplace or company pension account.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "CPEN";
		}
	};
	/**
	 * Private pension account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivatePensionScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Private pension account."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode PrivatePensionScheme = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivatePensionScheme";
			definition = "Private pension account.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "PPEN";
		}
	};
	/**
	 * Account owned by a CSD participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDParticipantAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account owned by a CSD participant."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode CSDParticipantAccount = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDParticipantAccount";
			definition = "Account owned by a CSD participant.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "CSDP";
		}
	};
	/**
	 * Account operated by a CSD for mirroring positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDMirrorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account operated by a CSD for mirroring positions."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode CSDMirrorAccount = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDMirrorAccount";
			definition = "Account operated by a CSD for mirroring positions.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "CSDM";
		}
	};
	/**
	 * Account operated by a CSD for settlement of securities legs for
	 * instructions involving internal CSDs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCSDAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account operated by a CSD for settlement of securities legs for instructions involving internal CSDs."
	 * </li>
	 * </ul>
	 */
	public static final FundCashAccountCode InterCSDAccount = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCSDAccount";
			definition = "Account operated by a CSD for settlement of securities legs for instructions involving internal CSDs.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "ICSA";
		}
	};
	/**
	 * Account operated by a CSD in a direct holding market context
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalOffsetAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account operated by a CSD in a direct holding market context"</li>
	 * </ul>
	 */
	public static final FundCashAccountCode TechnicalOffsetAccount = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalOffsetAccount";
			definition = "Account operated by a CSD in a direct holding market context";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "TOFF";
		}
	};
	/**
	 * Account operated by a CSD in cross-CSD settlement context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDOmnibusAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account operated by a CSD in cross-CSD settlement context."</li>
	 * </ul>
	 */
	public static final FundCashAccountCode CSDOmnibusAccount = new FundCashAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOmnibusAccount";
			definition = "Account operated by a CSD in cross-CSD settlement context.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundCashAccountCode.mmObject();
			codeName = "CSDO";
		}
	};
	final static private LinkedHashMap<String, FundCashAccountCode> codesByName = new LinkedHashMap<>();

	protected FundCashAccountCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundCashAccountCode";
				definition = "Specifies the cash account type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundCashAccountCode.CashAccount, com.tools20022.repository.codeset.FundCashAccountCode.PensionFundOrdinary,
						com.tools20022.repository.codeset.FundCashAccountCode.PensionFundSpecial, com.tools20022.repository.codeset.FundCashAccountCode.RetirementScheme, com.tools20022.repository.codeset.FundCashAccountCode.Other,
						com.tools20022.repository.codeset.FundCashAccountCode.HedgeFund, com.tools20022.repository.codeset.FundCashAccountCode.WorkplacePensionSchema,
						com.tools20022.repository.codeset.FundCashAccountCode.PrivatePensionScheme, com.tools20022.repository.codeset.FundCashAccountCode.CSDParticipantAccount,
						com.tools20022.repository.codeset.FundCashAccountCode.CSDMirrorAccount, com.tools20022.repository.codeset.FundCashAccountCode.InterCSDAccount,
						com.tools20022.repository.codeset.FundCashAccountCode.TechnicalOffsetAccount, com.tools20022.repository.codeset.FundCashAccountCode.CSDOmnibusAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(PensionFundOrdinary.getCodeName().get(), PensionFundOrdinary);
		codesByName.put(PensionFundSpecial.getCodeName().get(), PensionFundSpecial);
		codesByName.put(RetirementScheme.getCodeName().get(), RetirementScheme);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(HedgeFund.getCodeName().get(), HedgeFund);
		codesByName.put(WorkplacePensionSchema.getCodeName().get(), WorkplacePensionSchema);
		codesByName.put(PrivatePensionScheme.getCodeName().get(), PrivatePensionScheme);
		codesByName.put(CSDParticipantAccount.getCodeName().get(), CSDParticipantAccount);
		codesByName.put(CSDMirrorAccount.getCodeName().get(), CSDMirrorAccount);
		codesByName.put(InterCSDAccount.getCodeName().get(), InterCSDAccount);
		codesByName.put(TechnicalOffsetAccount.getCodeName().get(), TechnicalOffsetAccount);
		codesByName.put(CSDOmnibusAccount.getCodeName().get(), CSDOmnibusAccount);
	}

	public static FundCashAccountCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundCashAccountCode[] values() {
		FundCashAccountCode[] values = new FundCashAccountCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundCashAccountCode> {
		@Override
		public FundCashAccountCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundCashAccountCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
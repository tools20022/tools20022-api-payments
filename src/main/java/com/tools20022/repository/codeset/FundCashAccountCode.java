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
 * Specifies the cash account type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#CashAccount
 * FundCashAccountCode.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#PensionFundOrdinary
 * FundCashAccountCode.PensionFundOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#PensionFundSpecial
 * FundCashAccountCode.PensionFundSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#RetirementScheme
 * FundCashAccountCode.RetirementScheme}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FundCashAccountCode#Other
 * FundCashAccountCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#HedgeFund
 * FundCashAccountCode.HedgeFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#WorkplacePensionSchema
 * FundCashAccountCode.WorkplacePensionSchema}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#PrivatePensionScheme
 * FundCashAccountCode.PrivatePensionScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#CSDParticipantAccount
 * FundCashAccountCode.CSDParticipantAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#CSDMirrorAccount
 * FundCashAccountCode.CSDMirrorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#InterCSDAccount
 * FundCashAccountCode.InterCSDAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#TechnicalOffsetAccount
 * FundCashAccountCode.TechnicalOffsetAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#CSDOmnibusAccount
 * FundCashAccountCode.CSDOmnibusAccount}</li>
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
public class FundCashAccountCode {

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
	public static final MMCode CashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode PensionFundOrdinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PensionFundOrdinary";
			definition = "Central Provident Fund (CPF) ordinary account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode PensionFundSpecial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PensionFundSpecial";
			definition = "Central Provident Fund (CPF) special account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode RetirementScheme = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetirementScheme";
			definition = "Supplementary Retirement Scheme (SRS) account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type cash account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode HedgeFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HedgeFund";
			definition = "Hedge fund account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode WorkplacePensionSchema = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkplacePensionSchema";
			definition = "Workplace or company pension account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode PrivatePensionScheme = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivatePensionScheme";
			definition = "Private pension account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode CSDParticipantAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDParticipantAccount";
			definition = "Account owned by a CSD participant.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode CSDMirrorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDMirrorAccount";
			definition = "Account operated by a CSD for mirroring positions.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode InterCSDAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCSDAccount";
			definition = "Account operated by a CSD for settlement of securities legs for instructions involving internal CSDs.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode TechnicalOffsetAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalOffsetAccount";
			definition = "Account operated by a CSD in a direct holding market context";
			owner_lazy = () -> FundCashAccountCode.mmObject();
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
	public static final MMCode CSDOmnibusAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOmnibusAccount";
			definition = "Account operated by a CSD in cross-CSD settlement context.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CSDO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
}
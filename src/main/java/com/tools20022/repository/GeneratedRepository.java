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

package com.tools20022.repository;

import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repository.area.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 
 <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepository#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepository#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * </ul>
 */
public class GeneratedRepository extends ReflectionBasedRepository {

	final static private AtomicReference<MMRepository> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of BusinessProcessCatalogue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getTopLevelCatalogueEntry
	 * topLevelCatalogueEntry} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsInitiationLatestVersion
	 * PaymentsInitiationLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
	 * AccountManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
	 * CashManagementLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.BusinessApplicationHeaderLatestVersion
	 * BusinessApplicationHeaderLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
	 * PaymentsClearingandSettlementLatestVersion}</li>
	 * <li>{@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
	 * AuthoritiesLatestVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.PaymentsRemittanceAdviceLatestVersion
	 * PaymentsRemittanceAdviceLatestVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessProcessCatalogue#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * </ul>
	 */
	public static final MMBusinessProcessCatalogue catalogue = new MMBusinessProcessCatalogue() {
		{
			topLevelCatalogueEntry_lazy = () -> Arrays.asList(PaymentsInitiationLatestVersion.mmObject(), AccountManagementLatestVersion.mmObject(), CashManagementLatestVersion.mmObject(), BusinessApplicationHeaderLatestVersion.mmObject(),
					PaymentsClearingandSettlementLatestVersion.mmObject(), AuthoritiesLatestVersion.mmObject(), PaymentsRemittanceAdviceLatestVersion.mmObject());
			repository_lazy = () -> GeneratedRepository.mmObject();
		}
	};
	/**
	 * An instance of DataDictionary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMDataDictionary#getRepository
	 * repository} = {@linkplain com.tools20022.repository.GeneratedRepository
	 * GeneratedRepository}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMDataDictionary#getTopLevelDictionaryEntry
	 * topLevelDictionaryEntry} = List of 1844 elements</li>
	 * </ul>
	 */
	public static final MMDataDictionary dataDict = new MMDataDictionary() {
		{
			topLevelDictionaryEntry_lazy = () -> ListBuilderForGeneratedRepository_00.addElems(new ArrayList<>());
			repository_lazy = () -> GeneratedRepository.mmObject();
		}
	};

	private GeneratedRepository() {
		super(StandardMetamodel2013.metamodel());
	}

	final static public MMRepository mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRepository() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
			}
		});
		return mmObject_lazy.get();
	}
}